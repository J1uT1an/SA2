package ObjectOriented;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
	public static void main(String[] args) {
		Input input = new Input();
		input.input("C:\\code-program\\Java\\SoftwareArchitecture\\KWIC\\src\\MyKWIC\\input.txt");
		Shift shift = new Shift(input.getLineTxt());
		shift.shift();
		Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
		alphabetizer.sort();
		Output output = new Output(alphabetizer.getKwicList());
		output.output("C:\\code-program\\Java\\SoftwareArchitecture\\KWIC\\src\\MyKWIC\\output.txt");
	}
}
