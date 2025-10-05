<!DOCTYPE html>
<!-- 
    <!DOCTYPE html> tells the browser this is an HTML5 document
-->
<html lang="en">
<!-- 'lang' attribute defines the language of the document -->

<head>
    <!-- The <head> contains meta information and styling -->
    <meta charset="UTF-8">
    <!-- 'charset' defines character encoding (UTF-8 supports all characters) -->

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 'viewport' makes the page responsive on all devices -->

    <title>HTML & CSS Workshop Demo</title>
    <!-- Title displayed in browser tab -->

    <!-- ========== INTERNAL CSS STYLES ========== -->
    <style>
        /* Global Styles for the entire page */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(120deg, #a1c4fd, #c2e9fb);
            /* Gradient background */
            color: #333;
        }

        /* Common layout styling for major sections */
        header,
        footer,
        nav,
        section,
        article,
        aside {
            background: #fff;
            border-radius: 12px;
            padding: 20px;
            margin: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        /* HEADER styling */
        header {
            background: linear-gradient(120deg, #89f7fe, #66a6ff);
            color: #fff;
            text-align: center;
            padding: 40px 20px;
        }

        header h1 {
            margin: 0;
        }

        /* NAVIGATION bar styling */
        nav {
            text-align: center;
            background: #f8f9fa;
        }

        /* Styling for <a> (anchor) links inside nav */
        nav a {
            text-decoration: none;
            color: #007bff;
            margin: 0 10px;
            font-weight: bold;
            transition: color 0.3s;
        }

        nav a:hover {
            color: #0056b3;
        }

        /* Headings for each section */
        section h2,
        article h2 {
            color: #444;
            border-bottom: 2px solid #007bff;
            display: inline-block;
            padding-bottom: 5px;
        }

        /* TABLE styling */
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 10px;
        }

        th,
        td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }

        th {
            background: #007bff;
            color: white;
        }

        /* FORM styling */
        form {
            margin-top: 15px;
        }

        fieldset {
            border: 2px solid #007bff;
            border-radius: 8px;
            padding: 15px;
        }

        legend {
            font-weight: bold;
            color: #007bff;
        }

        input,
        select,
        textarea,
        button {
            margin: 5px 0;
            padding: 8px;
            border-radius: 6px;
            border: 1px solid #ccc;
        }

        /* Button hover effect */
        button {
            background: #007bff;
            color: white;
            border: none;
            cursor: pointer;
        }

        button:hover {
            background: #0056b3;
        }

        /* MEDIA SECTION layout */
        .media-container {
            display: flex;
            flex-wrap: wrap;
            gap: 20px;
            justify-content: center;
            align-items: center;
            margin-top: 15px;
        }

        .media-container img,
        .media-container audio,
        .media-container video {
            border-radius: 10px;
            box-shadow: 0 3px 8px rgba(0, 0, 0, 0.2);
        }

        .media-container img {
            width: 150px;
            height: 150px;
        }

        /* FOOTER styling */
        footer {
            text-align: center;
            background: #343a40;
            color: white;
            padding: 15px;
            font-size: 0.9rem;
        }

        /* Highlighted text style */
        .highlight {
            color: #ff5f6d;
            font-weight: bold;
        }
    </style>
</head>

<body>
    <!-- ========== HEADER SECTION ========== -->
    <header>
        <h1>HTML & CSS Workshop Demo</h1>
        <p>Learn the <span class="highlight">building blocks</span> of the Web!</p>
        <!-- <span> is used for inline styling inside a line -->
    </header>

    <!-- ========== NAVIGATION LINKS ========== -->
    <nav>
        <!-- Each <a> tag creates a hyperlink -->
        <a href="#section1">Section 1</a> |
        <a href="#section2">Section 2</a>
    </nav>

    <!-- ========== MAIN CONTENT ========== -->
    <main>
        <!-- SECTION 1: Text and Lists -->
        <section id="section1">
            <!-- 'id' is used for linking and unique identification -->
            <h2>Text and Lists</h2>

            <!-- Unordered List -->
            <ul>
                <li>HTML</li>
                <li>CSS</li>
                <li>JavaScript</li>
            </ul>

            <!-- Ordered List -->
            <ol>
                <li>Step One</li>
                <li>Step Two</li>
                <li>Step Three</li>
            </ol>

            <!-- Inline styled DIV block -->
            <div style="background-color: #e3f2fd; padding: 10px; border-radius: 8px;">
                This is a <strong>div block</strong> with inline styling.
            </div>
        </section>

        <!-- SECTION 2: Table and Form -->
        <section id="section2">
            <h2>Table Example</h2>

            <!-- TABLE with caption, thead, tbody, and tfoot -->
            <table>
                <caption>Sample Table</caption> <!-- Caption acts as table title -->
                <thead>
                    <tr>
                        <th>Item</th>
                        <th>Quantity</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Pen</td>
                        <td>10</td>
                        <td>$5</td>
                    </tr>
                    <tr>
                        <td>Notebook</td>
                        <td>5</td>
                        <td>$20</td>
                    </tr>
                </tbody>
                <tfoot>
                    <tr>
                        <td colspan="2">Total</td>
                        <!-- 'colspan' merges two cells horizontally -->
                        <td>$25</td>
                    </tr>
                </tfoot>
            </table>

            <!-- FORM Example -->
            <h2>Form Example</h2>
            <form action="#" method="post">
                <!-- 'action' defines where data is sent, 'method' can be GET or POST -->
                <fieldset>
                    <!-- <fieldset> groups related form elements -->
                    <legend>Contact Form</legend> <!-- <legend> gives title to fieldset -->

                    <!-- Input fields with labels -->
                    <label for="name">Name:</label><br>
                    <input type="text" id="name" placeholder="Enter your name" required><br>
                    <!-- 'placeholder' gives hint, 'required' ensures mandatory entry -->

                    <label for="email">Email:</label><br>
                    <input type="email" id="email" placeholder="Enter your email" required><br>

                    <!-- Radio Buttons -->
                    <label>Gender:</label><br>
                    <input type="radio" name="gender" value="male"> Male
                    <input type="radio" name="gender" value="female"> Female<br>

                    <!-- Checkboxes -->
                    <label>Hobbies:</label><br>
                    <input type="checkbox" value="reading"> Reading
                    <input type="checkbox" value="sports"> Sports<br>

                    <!-- Dropdown Menu -->
                    <label for="country">Country:</label><br>
                    <select id="country">
                        <option value="india">India</option>
                        <option value="usa">USA</option>
                        <option value="uk">UK</option>
                    </select><br>

                    <!-- Textarea for longer messages -->
                    <label for="message">Message:</label><br>
                    <textarea id="message" rows="4" cols="30"></textarea><br>

                    <!-- Buttons -->
                    <button type="submit">Submit</button>
                    <button type="reset">Reset</button>
                </fieldset>
            </form>
        </section>

        <!-- ARTICLE: Media Example -->
        <article>
            <h2>Media Example</h2>

            <!-- Flexbox container for alignment -->
            <div class="media-container">
                <!-- IMAGE -->
                <img src="D:\1. College\Mozilla\Workshop\tree.jpg" alt="Placeholder Image">
                <!-- 'alt' provides alternative text if image fails to load -->

                <!-- AUDIO -->
                <audio controls>
                    <!-- 'controls' adds play/pause buttons -->
                    <source src="audio.mp3" type="audio/mpeg">
                    Your browser does not support the audio element.
                </audio>

                <!-- VIDEO -->
                <video width="300" height="180" controls>
                    <!-- 'width' and 'height' set video size -->
                    <source src="video.mp4" type="video/mp4">
                    Your browser does not support the video element.
                </video>
            </div>
        </article>
    </main>

    <!-- FOOTER -->
    <footer>
        <p>&copy; 2025 My Web Page. All rights reserved.</p>
        <!-- &copy; is the copyright symbol -->
    </footer>
</body>

</html>
