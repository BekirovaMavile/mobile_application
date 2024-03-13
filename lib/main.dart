import 'dart:math';

import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: GuessNumberGame(),
    );
  }
}

class GuessNumberGame extends StatefulWidget {
  @override
  _GuessNumberGameState createState() => _GuessNumberGameState();
}

class _GuessNumberGameState extends State<GuessNumberGame> {
  late int _secretNumber;
  TextEditingController _controller = TextEditingController();
  String _result = '';

  @override
  void initState() {
    super.initState();
    _startNewGame();
  }

  void _startNewGame() {
    setState(() {
      _secretNumber = Random().nextInt(101);
      _result = '';
      _controller.text = '';
    });
  }

  void _checkGuess() {
    int? userGuess = int.tryParse(_controller.text);
    if (userGuess == null) {
      setState(() {
        _result = 'Пожалуйста, введите число от 0 до 100';
      });
    } else {
      setState(() {
        if (userGuess < _secretNumber) {
          _result = 'Ваше число меньше загаданного';
        } else if (userGuess > _secretNumber) {
          _result = 'Ваше число больше загаданного';
        } else {
          _result = 'Ура, победа! Вы угадали число $_secretNumber';
        }
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Угадай число'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              'Введите число от 0 до 100',
              style: TextStyle(fontSize: 18),
            ),
            TextField(
              controller: _controller,
              keyboardType: TextInputType.number,
              decoration: InputDecoration(
                hintText: 'Введите число',
              ),
            ),
            SizedBox(height: 16),
            ElevatedButton(
              onPressed: _checkGuess,
              child: Text('Проверить'),
            ),
            SizedBox(height: 16),
            Text(
              _result,
              style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
            ),
            SizedBox(height: 16),
            ElevatedButton(
              onPressed: _startNewGame,
              child: Text('Начать новую игру'),
            ),
          ],
        ),
      ),
    );
  }
}
