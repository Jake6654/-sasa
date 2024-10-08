package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*
    @Override
    public boolean equals(Object obj){
        // Object 클래스에는 id 라는 필드가 없기 때문에 다운 캐스팅
        UserV2 user = (UserV2) obj;
        // 나의 아이디와 메서드를 통해 받은 obj의 아이디가 같은지 비교
        return this.id.equals(user.id);

     */
    // 정확한 equals의 구현을 위해 Generator 사용
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}

