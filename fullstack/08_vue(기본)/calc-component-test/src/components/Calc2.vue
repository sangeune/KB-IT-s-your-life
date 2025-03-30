<template>
  <div>
    X : <input type="text" v-model.number="x" /><br />
    Y : <input type="text" v-model.number="y" /><br />
    <button @click="calcAdd">계산</button><br />
    <div>결과 : {{ result }}</div>
  </div>
</template>

<script>
// 반응성 가진 참조형 데이터 생성하는 ref 이용
import { ref } from "vue";

export default {
  name: "Calc2",
  setup() {
    const x = ref(10);
    const y = ref(20);
    const result = ref(30);
    const calcAdd = () => {
      result.value = x.value + y.value; // value 속성 이용하기
    };

    return { x, y, result, calcAdd };
  },
};
</script>
