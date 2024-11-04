package zerobase.weather.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import zerobase.weather.domain.Diary;
import zerobase.weather.service.DiaryService;

import java.time.LocalDate;
import java.util.List;

@RestController
public class DiaryController {
    private final DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    /*
    * POST / create / diary
    * date parameter 로 받아주세요. (date 형식 : yyyy-MM-dd)
    *    - text parameter 로 일기 글을 받아주세요.
    *   - 외부 API 에서 받아온 날씨 데이터와 함께 DB에 저장해주세요.
    */
    @PostMapping("/create/diary")
    void createDiary(
            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestBody String text
    ){
        diaryService.createDiary(date, text);
    }

    /*
    * GET / read / diary
    * - date parameter 로 조회할 날짜를 받아주세요.
    * - 해당 날짜의 일기를 List 형태로 반환해주세요.
    */
    @GetMapping("/read/diary")
    List<Diary> readDiary(
            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ){
        return diaryService.readDiary(date);
    }

    /*
    * GET / read / diaries
    * - startDate, endDate parameter 로 조회할 날짜 기간의 시작일/종료일을 받아주세요.
    * - 해당 기간의 일기를 List 형태로 반환해주세요.
    */

    /*
    * PUT / update / diary
    * - date parameter 로 수정할 날짜를 받아주세요.
    * - text parameter 로 수정할 새 일기 글을 받아주세요.
    * - 해당 날짜의 첫번째 일기 글을 새로 받아온 일기글로 수정해주세요.
    */

    /*
    * DELETE / delete / diary
    * - date parameter 로 삭제할 날짜를 받아주세요.
    * - 해당 날짜의 모든 일기를 지워주세요.
    */

}
