class Solution {
public:
    int romanToInt(string s) {
        int m = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s[i] == 'M') {
                m += 1000;
            }
            else if (s[i] == 'D') {
                m += 500;
            }
            else if (s[i] == 'C') {
                if (i + 1 < s.length() && (s[i + 1] == 'D' || s[i + 1] == 'M'))
                    m -= 100;
                else
                    m += 100;
            }
            else if (s[i] == 'L') {
                m += 50;
            }
            else if (s[i] == 'X') {
                if (i + 1 < s.length() && (s[i + 1] == 'L' || s[i + 1] == 'C'))
                    m -= 10;
                else
                    m += 10;
            }
            else if (s[i] == 'V') {
                m += 5;
            }
            else if (s[i] == 'I') {
                if (i + 1 < s.length() && (s[i + 1] == 'V' || s[i + 1] == 'X'))
                    m -= 1;
                else
                    m += 1;
            }
        }

        return m;
    }
};