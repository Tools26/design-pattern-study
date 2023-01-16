# Singleton Pattern

### 주제
키보드 리스너
### 주제 선정 배경
소프트웨어 공학 수업을 들으면서 테트리스 프로젝트를 할 때, 키보드 리스너를 커스텀해서 사용했는데, 이를 어떻게 관리할지 고민했었음.
### 동작방식
Singleton Pattern을 상속해서 사용했음.
tetris.py에서 테트리스를 구성하는 여러가지 클래스를 간단히 적어놨는데, 이 클래스들은 다들 keyboardListener가 필요.
하지만 board에 대해서, block에 대해서 키보드 리스너가 다르게 동작하면 안되므로, 싱글톤 패턴을 적어서 같은 instance를 사용하도록 함.
### 결과
아래와 같이 다른 클래스에서 인스턴스를 불렀음에도, 같은 키보드 리스너를 참조하는 것을 볼 수 있다.
```
This is Tetris Menu Class
This is KeyBoard Input Listener
This is Tetris Block Class
This is Tetris Board class
<listener.KeyboardListener object at 0x7fd80d5a8670>
<listener.KeyboardListener object at 0x7fd80d5a8670>
<listener.KeyboardListener object at 0x7fd80d5a8670>
```
