public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();

        // Log no console
        consoleLogger.log("Mensagem de debug", LogLevel.DEBUG);
        consoleLogger.log("Mensagem de aviso", LogLevel.WARNING);
        consoleLogger.log("Mensagem de erro", LogLevel.ERROR);

        // Log no arquivo
        fileLogger.log("Mensagem de debug", LogLevel.DEBUG);
        fileLogger.log("Mensagem de aviso", LogLevel.WARNING);
        fileLogger.log("Mensagem de erro", LogLevel.ERROR);
    }
}