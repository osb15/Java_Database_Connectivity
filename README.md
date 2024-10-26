<h1>JDBC Operations with Statement and PreparedStatement</h1>

<p>This repository contains Java programs demonstrating basic CRUD (Create, Read, Update, Delete) operations using JDBC with <code>Statement</code> and <code>PreparedStatement</code> for database interactions. These programs allow users to interact with a <code>student</code> table in a MySQL database.</p>

<h2>Files Overview</h2>

<ol>
    <li><strong>JDBC_Statement.java</strong>
        <ul>
            <li>This program uses the <code>Statement</code> class to perform database operations. It provides a menu-driven interface to insert, update, delete, and display data from the <code>student</code> table.</li>
            <li>Methods:
                <ul>
                    <li><code>Insert()</code>: Adds a new student record.</li>
                    <li><code>Update()</code>: Updates an existing student record.</li>
                    <li><code>Delete()</code>: Removes a student record based on ID.</li>
                    <li><code>Display()</code>: Fetches and displays all records from the table.</li>
                </ul>
            </li>
        </ul>
    </li>
    <li><strong>Jdbc_PrepareStatement.java</strong>
        <ul>
            <li>This program utilizes <code>PreparedStatement</code> for secure and efficient database operations. It provides the same functionalities as the <code>JDBC_Statement</code> program but with improved security against SQL injection.</li>
            <li>Methods:
                <ul>
                    <li><code>insert()</code>, <code>Update()</code>, <code>Delete()</code>, and <code>Display()</code> perform the respective CRUD operations with <code>PreparedStatement</code>.</li>
                </ul>
            </li>
        </ul>
    </li>
    <li><strong>StatementOperations.java</strong>
        <ul>
            <li>This class contains methods that implement CRUD operations using the <code>Statement</code> class. These methods are used in <code>JDBC_Statement.java</code>.</li>
        </ul>
    </li>
    <li><strong>PrepareStatement.java</strong>
        <ul>
            <li>This class contains methods for CRUD operations using the <code>PreparedStatement</code> class. These methods are used in <code>Jdbc_PrepareStatement.java</code>.</li>
        </ul>
    </li>
</ol>

<h2>How to Run</h2>

<ol>
    <li><strong>Database Setup</strong>:
        <ul>
            <li>Create a MySQL database named <code>advance</code>.</li>
            <li>Create a table named <code>student</code> with the following structure:</li>
            <pre>
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    city VARCHAR(50)
);
            </pre>
            <li>Update the database URL, username, and password in the Java files as per your MySQL configuration.</li>
        </ul>
    </li>
    <li><strong>Compile and Run</strong>:
        <ul>
            <li>Compile the Java files:</li>
            <pre>javac JDBC_Statement.java Jdbc_PrepareStatement.java StatementOperations.java PrepareStatement.java</pre>
            <li>Run either <code>JDBC_Statement</code> or <code>Jdbc_PrepareStatement</code> to execute the program:</li>
            <pre>java JDBC_Statement</pre>
            or
            <pre>java Jdbc_PrepareStatement</pre>
        </ul>
    </li>
</ol>

<h2>Requirements</h2>

<ul>
    <li>Java Development Kit (JDK) 8 or higher.</li>
    <li>MySQL database.</li>
    <li>JDBC MySQL Driver.</li>
</ul>


