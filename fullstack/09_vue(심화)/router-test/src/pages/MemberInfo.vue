<!-- <template>
  <div class="card card-body">
    <h2>Member Info</h2>
    <div> -->
<!-- 요청 경로와 동적 파라미터의 값 출력 -->
<!-- id는 url에 따라 값이 바뀜 -->
<!-- 경로 패턴 : /members/:id<br />
      요청 경로 : {{ currentRoute.path }}<br />
      id 값 : {{ currentRoute.params.id }}<br />
    </div>
  </div>
</template> -->

<template>
  <div className="mt-5">
    <img :src="member.photo" class="img" />
    <h4 class="mt-2">{{ member.name }}({{ member.role }})</h4>
    <p>{{ member.desc }}</p>
    <!-- SNS 링크 존재하면 추가 -->
    <a
      v-if="member.insta && member.insta !== ''"
      class="fa fa-instagram m-1"
      :href="member.insta"
    ></a>
    <a
      v-if="member.facebook && member.facebook !== ''"
      class="fa fa-facebook m-1"
      :href="member.facebook"
    ></a>
    <a
      v-if="member.youtube && member.youtube !== ''"
      class="fa fa-youtube m-1"
      :href="member.youtube"
    ></a>
    <br /><br />
    <router-link to="/members">멤버 목록으로</router-link>
  </div>
</template>

<script>
import { useRoute } from "vue-router";
import members from "@/members.json";

export default {
  name: "MemberInfo",
  setup() {
    const currentRoute = useRoute();
    const id = parseInt(currentRoute.params.id, 10); // URL에서 id 값을 가져와 숫자로 변환
    const member = members.find((m) => m.id === id); // members.json에서 해당 id를 가진 멤버 찾기
    return { member };
  },
};
</script>
