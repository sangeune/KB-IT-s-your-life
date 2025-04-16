<template>
  <div>
    <Child1 />
    <Child2 />
    <Child3 />
  </div>
</template>

<script>
import Child1 from "./components/Child1.vue";
import Child2 from "./components/Child2.vue";
import Child3 from "./components/Child3.vue";

export default {
  name: "App",
  components: { Child1, Child2, Child3 }, // 지역 컴포넌트로 배치
};
</script>
