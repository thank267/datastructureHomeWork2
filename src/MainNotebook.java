import notebook.Notebook;

import java.util.Arrays;

public class MainNotebook {
    public static void main(String[] args) {

        Notebook[] arr = MyArray.getNotebookArray(10000);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
