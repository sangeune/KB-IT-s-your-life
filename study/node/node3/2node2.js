function a() {
  console.log('a');
}
function b() {
  setTimeout(() => {
    console.log('b');
    c();
  }, 2000);
  console.log('test');
}
function c() {
  console.log('c');
}

a();
b();
