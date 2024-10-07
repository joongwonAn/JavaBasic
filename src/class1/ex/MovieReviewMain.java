package class1.ex;
/* 영화 리뷰 관리하기 */
public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인센셥";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        MovieReview[] movieReviews = new MovieReview[]{inception, aboutTime};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
        }
    }
}
