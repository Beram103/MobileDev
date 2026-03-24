
Step-by-Step Guide to Run the Project
Step 1: Open the Project
Launch Android Studio
Open the provided project folder

Step 2: Enable ViewBinding
Open build.gradle (Module)
Add or make sure this is included:
android {
buildFeatures {
viewBinding = true
}
}

Step 3: Replace Required Files
Replace the following with the submitted versions:
activity_main.xml
MainActivity.java

Step 4: Set the Wall Color
In MainActivity.java, locate:
WALL_COLOR
Change it to the actual lab wall color (e.g., "blue")

Step 5: Run the App
Run the project using:
Emulator OR
Physical Android device
Minimum requirement: API 24+

Step-by-Step Password Rule
Step 1: Get Required Inputs
Wall color (set in code)
Student ID (entered by user)

Step 2: Extract Last 2 Digits
Take the last 2 digits of the Student ID

Step 3: Combine Values
password = <wall color> + <last 2 digits of Student ID>

Step 4: Example
Wall color: blue
Student ID: 2301456

➡️ Password = blue56

Step 5: Case Handling
Password comparison is case-insensitive
blue56 ✅
Blue56 ✅
BLUE56 ✅


Step-by-Step Validation Process (Java)
Step 1: Read and Clean Input
Use:
getText()
toString()
trim()

➡️ Removes unnecessary spaces

Step 2: Check Empty Fields
Use:
isEmpty()

➡️ Prevents blank input

Step 3: Validate Student ID Length
Use:
length()

➡️ Must be at least 2 digits

Step 4: Extract Last Two Digits
Use:
substring()

➡️ Gets last 2 characters

Step 5: Create Expected Password
Use:
+

➡️ Combines wall color + digits

Step 6: Compare Passwords
Use:
toLowerCase()
equals()

➡️ Ensures case-insensitive comparison