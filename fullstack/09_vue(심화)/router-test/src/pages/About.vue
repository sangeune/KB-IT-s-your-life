<template>
  <div class="card card-body">
    <h2>About</h2>
    <!-- 전체 요청 경로 -->
    <p>요청 경로 : {{ $route.fullPath }}</p>
  </div>
</template>

<script>
import { useRoute } from "vue-router";

export default {
  name: "About",
  setup() {
    // setup에서는 this 사용 불가
    const route = useRoute(); // 현재 라우트 정보 가져오기
    console.log(route); // 출력
    return { route }; // 템플릿에서 사용할 수 있도록 반환
  },
  // created() {
  //   console.log(this.$route); // 출력
  // },
};
</script>
