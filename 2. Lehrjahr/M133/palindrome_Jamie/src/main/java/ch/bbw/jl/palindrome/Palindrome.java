package ch.bbw.jl.palindrome;

public class Palindrome {
    private String result;
    private String text;

    public void check() {
        String origString = getText().toLowerCase()
                .replaceAll("[-!$%^&*()_+|~=`{}\\[\\]:\";'<>?,.\\/ ]", "");
        boolean isPalindrome = true;

        for (int begin = 0; begin < origString.length(); begin++) {
            if (origString.charAt(begin) != origString.charAt(origString.length() - 1 - begin)) {
                setResult("Not a palindrome...");
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            setResult("Is a palindrome!");
        }
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
