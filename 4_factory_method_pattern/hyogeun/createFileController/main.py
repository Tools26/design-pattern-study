from fileCreator import CreateFileFactory


if __name__ == "__main__":
    factory = CreateFileFactory()
    pythonFile = factory.createFile("abc.py")
    swiftFile = factory.createFile("abc.swift")
    kotlinFile = factory.createFile("abc.kt")
    javaFile = factory.createFile("abc.java")
    classFile = factory.createFile("abc.class")

    print(pythonFile.getName())
    print(swiftFile.getName())
    print(kotlinFile.getName())
    print(javaFile.getName())
    print(classFile.getName())
