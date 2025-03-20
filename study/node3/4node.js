fetch('https://jsonplaceholder.typicode.com/users')
  .then((response) => {
    console.log(response.status); // 상태 코드 (예: 200)
    return response.json(); // JSON 데이터 변환
  })
  .then((data) => console.log(data))
  .catch((err) => console.log(err));

// fetch() 함수는 비동기적으로 HTTP 요청을 보내고, Promise를 반환합니다.
// 이 요청이 성공하면 response 객체가 반환됩니다.

// response.json() 메서드를 호출하여 응답을 JSON 형식으로 변환합니다.
// response.json()도 비동기 함수이므로 Promise를 반환하며, 다음 .then()에서 data를 사용할 수 있습니다.

// url이 잘못되었거나 네트워크 문제가 발생하면 catch() 블록이 실행됩니다.
// catch() 블록은 에러 메시지를 출력합니다.

// --------------------------------------------------------
// 아래처럼 보완

fetch('https://jsonplaceholder.typicode.com/users')
  .then((response) => {
    if (!response.ok) {
      throw new Error(`HTTP 오류! 상태 코드: ${response.status}`);
    }
    return response.json();
  })
  .then((data) => console.log('✅ 사용자 데이터:', data))
  .catch((err) => console.error('❌ 오류 발생:', err.message));

// 서버 응답 상태를 확인하고, 에러 발생 시 사용자에게 적절한 메시지를 표시
// response.ok를 확인하여 HTTP 상태 코드가 200~299가 아닐 경우 오류 처리
// console.error()를 사용해 오류 메시지를 좀 더 명확하게 출력
