/**
 * WordID combines the word with the inverted index list's ID
 * @author Qihang Shen
 */
public class WordID implements Comparable<WordID> {
    private final String word;
    private final int id;

    public WordID(String word) {
        this.word = word;
        this.id = word.hashCode();
    }

    public WordID(String word, int id) {
        this.word = word;
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WordID)) {
            return false;
        }
        WordID other = (WordID) o;
        return this.word.equals(other.word);
    }

    @Override
    public int compareTo(WordID other) {
        return this.word.compareTo(other.word);
    }
}
