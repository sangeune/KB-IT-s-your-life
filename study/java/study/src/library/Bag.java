package library;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//메서드 호출 시 전달할 데이터를
//묶어서 전달하기 위해
//가방을 만들어서 값을 넣어 전달함.
//DTO(VO)

@AllArgsConstructor //모든 필드 넣은 생성자
@NoArgsConstructor //기본 생성자(파라메터없는)
@Data //toString(), get/set메서드 등
public class Bag {
    private String name;
    private int age;
}
