<template>
  <div class="card card-body">
    <h2>Member Info</h2>
    <div>
      경로 패턴 : /members/:id<br />> 요청 경로 : {{ currentRoute.path }}<br />
      id 값 : {{ currentRoute.params.id }}<br />
    </div>
  </div>
</template>

<script>
// import { useRoute } from "vue-router";
import members from "@/members.json";

export default {
  name: "MemberInfo",
  setup() {
    // const currentRoute = useRoute();
    // return { currentRoute };
    return { member };
  },
};
</script>
