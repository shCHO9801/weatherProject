package zerobase.weather;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Memo;
import zerobase.weather.repository.JpaMemoRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
@Transactional
public class JpaMemoRepositoryTest {

    @Autowired
    JpaMemoRepository jpaMemoRepository;

    // memo의 값이 저장이 되는지 확인
    @Test
    @DisplayName("Memo 저장 테스트")
    void insertMemoTest() {
        //given
        Memo newMemo = new Memo(10, "this is memo");

        //when
        jpaMemoRepository.save(newMemo);

        //then
        // 모든 Memo를 조회해 List로 저장
        List<Memo> memoList = jpaMemoRepository.findAll();
        assertFalse(memoList.isEmpty());
    }

    // id로 값을 찾을 수 있는지 test
    @Test
    @DisplayName("Memo 전체 조회")
    void findAllMemoTest() {
        //given
        //when
        List<Memo> memoList = jpaMemoRepository.findAll();
        System.out.println(memoList);

        //then
        assertNotNull(memoList);
    }
}
