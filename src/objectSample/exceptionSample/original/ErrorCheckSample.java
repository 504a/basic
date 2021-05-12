package objectSample.exceptionSample.original;

class ErrorCheckSample {
    public static Data createData(String name,Gender gender,int age) throws CreateDataException {
        boolean nameError = false,ageError = false;

        //エラーチェック
        if (name != null) {
            if(name.isEmpty() || name.length() > 10) nameError = true;
        } else {
            nameError = true;
        }

        if(age < 0 || age > 120) ageError = true;

        if (nameError || ageError) {
            throw new CreateDataException(nameError, ageError);
        }

        return new Data(name,gender,age);

    }
    public static void main(String[] args) {
        try {
            Data data1 = createData("tom",Gender.MEN,29);
        } catch (CreateDataException e) {
            e.printStackTrace();
        }
    }
}
