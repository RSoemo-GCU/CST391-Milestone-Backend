package gcu.rsoemo.cst391.milestone.referencearchitecturelayer;

public class ChapterModel
{
    // Class Variables
    private int chapter_id;
    private int chapter_bookid;
    private String chapter_content;

    //constructors
    public ChapterModel() {
        super();
    }
    public ChapterModel(int chapter_id, int chapter_bookid, String chapter_content) {
        this.chapter_id = chapter_id;
        this.chapter_bookid = chapter_bookid;
        this.chapter_content = chapter_content;
    }

    //getters and setters
    public int getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(int chapter_id) {
        this.chapter_id = chapter_id;
    }

    public int getChapter_bookid() {
        return chapter_bookid;
    }

    public void setChapter_bookid(int chapter_bookid) {
        this.chapter_bookid = chapter_bookid;
    }

    public String getChapter_content() {
        return chapter_content;
    }

    public void setChapter_content(String chapter_content) {
        this.chapter_content = chapter_content;
    }
}