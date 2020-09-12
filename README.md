# Vega Mobile

Disclaimer: this library is not endorsed and associated in any form and kind with the original authors of [Vega](https://vega.github.io/vega)

**What is this?**
This is a wrapper for the [vega-embed](https://github.com/vega/vega-embed) library, and does not require an internet connection.

**How do this work?**
This library is a WebView that can render a vega description in json format. The WebView loads a html file, and the json file is converted to base64 and passed as an url parameter.

**Is the library only this?**
For now, yes. The next task is adding a Java class that creates a json specification. The plan is to write a renderer for Android Canvas and reimplement the original library in Java.

**How can I use this in my project?**
1. First import the library to your file
  import net.pertence.VegaView
2. Instatiate the view, for example in the onCreate()
  @override
  void onCreate(savedInstanceState: Bundle?) {
    WebView vegaView = VegaView(applicationContext);
    ...
3. Load the json
    String spec = "..."
    vegaView.loadSpec(spec);
4. Set the view's content
    setContentView(vegaView);

**How can I add the library to my project?**
In the the configuration files add:
  repositories {
    ...
    maven { url "https://jitpack.io" }
  }
and
  dependencies {
    ...
    implementation 'com.github.pertence:vega_mobile:1.0'
  }
  
**Do you have any plans to publish in Jcenter?**
Yes, however I having some issues.

**What is the license?**
The license is [3-Clause BSD License](https://opensource.org/licenses/BSD-3-Clause)

