#include<iostream>
using namespace std;

class classException {
public:
    class Exception {
        const char* m_description;

    public:
        Exception(const char* description)
            : m_description(description)
        {
        }
        const char* what() const
        {
            return m_description;
        }
    };

    void throwCustomException() noexcept(true)
    {
        throw Exception("Custom exception thrown");
    }
};

int main()
{
    classException Obj;

    try {
        Obj.throwCustomException();
    } catch (const classException::Exception& ex) {
        cout << "Caught custom exception: " << ex.what() << endl;
    }

    return 0;
}
