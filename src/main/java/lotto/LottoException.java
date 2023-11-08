package lotto;

public enum LottoException {
    LOTTO_NUMBER_INVALID_RANGE("로또 번호는 1부터 45 사이의 숫자여야 합니다."),
    LOTTO_NUMBER_NOT_ORDERED("숫자가 정렬되어 있지 않습니다."),
    LOTTO_HAS_DUPLICATE_NUM("중복된 번호가 존재합니다."),
    LOTTO_NUMBER_INVALID_SIZE("6개의 번호가 존재하지 않습니다.");

    LottoException(String message) {
        this.message = message;
    }
    private final String message;

    public String getMessage() {
        return message;
    }
}
