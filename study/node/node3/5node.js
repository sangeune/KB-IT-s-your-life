async function init() {
  try {
    const response = await fetch('https://jsonplaceholder.typicode.com/users');
    const users = await response.json();
    console.log(users);
  } catch (err) {
    console.error(err);
  }
}

init();

//async await는 Promise를 더 쉽게 사용할 수 있게 해줍니다.
