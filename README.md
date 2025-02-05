## ⚾ 숫자 야구 게임 ⚾

### 🔍 목표 : 컴퓨터가 생성한 3자리 숫자를 플레이어가 맞추는 게임

### 💻 숫자에 대한 요구사항
- 세 자리 수 는 1에서 9 사이의 숫자여야 한다.
- 동일한 숫자는 사용될 수 없다. 즉, 숫자는 중복되지 않아야 한다.
  - ex ) 333, 112, 119 불가능
- 각 시도에 대해 '스트라이크'와 '볼'의 개수를 출력하여 플레이어가 숫자를 맞출 수 있도록 유도한다.

---
### 💡 요구사항 정의 및 설계
#### 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임
  - 숫자와 자리의 위치가 맞으면 스트라이크, 숫자만 맞으면 볼, 숫자와 자리의 위치가 모두 일치하지 않으면 아웃으로 표시된다.
    - 예) 상대방(컴퓨터)의 수가 486일때
        - 456을 제시한 경우 : 2 스트라이크 0 볼
        - 345를 제시한 경우 : 0 스트라이크 1 볼
        - 123을 제시한 경우 : 아웃
  - 컴퓨터는 랜덤으로 서로 다른 3자리 숫자를 선택한다.
  - 플레이어는 힌트를 통해 컴퓨터가 임의로 정한 3자리 숫자를 추측하여 입력한다.
  - 컴퓨터는 입력한 숫자에 대한 힌트/ 결과를 출력한다.
  - 컴퓨터가 생성한 숫자 3개를 모두 맞히면 게임이 종료된다.

### 🔥 입출력
  - 입력
    - 서로 다른 3자리의 수
    - 1 입력 시, 게임 시작
    - 2 입력 시, 게임 기록 보기
    - 3 입력 시, 게임 종료

  - 출력
    - 스트라이크, 볼, 아웃 표시
    - 결과 문구 .. etc

---
### ✍ 트러블 슈팅
https://xxmnss.tistory.com/17
