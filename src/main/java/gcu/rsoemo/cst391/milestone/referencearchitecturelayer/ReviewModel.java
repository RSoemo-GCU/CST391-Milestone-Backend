package gcu.rsoemo.cst391.milestone.referencearchitecturelayer;

public class ReviewModel
{
    // Class Variables
    private int review_id;
    private String review_userid;
    private String review_content;

    // constructors
    public ReviewModel()
    {
        super();
    }
    public ReviewModel(int review_id, String review_userid, String review_content) {
        super();
        this.review_id = review_id;
        this.review_userid = review_userid;
        this.review_content = review_content;
    }


    // getters and setters
    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public String getReview_userid() {
        return review_userid;
    }

    public void setReview_userid(String review_userid) {
        this.review_userid = review_userid;
    }

    public String getReview_content() {
        return review_content;
    }

    public void setReview_content(String review_content) {
        this.review_content = review_content;
    }
}