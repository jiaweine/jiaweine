import java.io.IOException;
import java.nio.file.*;
import static java.nio.charset.StandardCharsets.UTF_8;

/** Java 21 generator for the animated GitHub profile hero. */
public final class ProfileUiGenerator {
  private static final Path OUT = Path.of("assets/hero-java.svg");
  private static final String FONT = "Inter,ui-sans-serif,system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,sans-serif";
  public static void main(String[] args) throws IOException {
    Files.createDirectories(OUT.getParent());
    Files.writeString(OUT, hero(), UTF_8);
    System.out.println("generated " + OUT);
  }
  private static String hero() {
    var s = new StringBuilder();
    s.append("""
<svg xmlns="http://www.w3.org/2000/svg" width="1200" height="470" viewBox="0 0 1200 470" role="img">
<defs>
 <linearGradient id="bg"><stop stop-color="#FBF7F0"/><stop offset="1" stop-color="#F3EBDD"/></linearGradient>
 <linearGradient id="skin" x2="1" y2="1"><stop stop-color="#F2C9A8"/><stop offset=".55" stop-color="#E7B38F"/><stop offset="1" stop-color="#CB8F70"/></linearGradient>
 <linearGradient id="shirt" x2="1" y2="1"><stop stop-color="#313238"/><stop offset="1" stop-color="#17181C"/></linearGradient>
 <linearGradient id="metal"><stop stop-color="#858B94"/><stop offset=".3" stop-color="#F4F5F6"/><stop offset=".65" stop-color="#A7ACB5"/><stop offset="1" stop-color="#747983"/></linearGradient>
</defs>
<rect x="18" y="24" width="1164" height="428" rx="34" fill="#BFAF9D" opacity=".14"/>
<rect x="14" y="14" width="1172" height="430" rx="34" fill="url(#bg)" stroke="#E4D9CB"/>
<circle cx="1090" cy="86" r="94" fill="#D56A4A" opacity=".075"/><circle cx="976" cy="388" r="132" fill="#8EA99B" opacity=".055"/>
""");
    text(s,62,79,11,"#6B625A","700","RESEARCH · SYSTEMS · BUILD");
    s.append("<circle cx=\"48\" cy=\"74\" r=\"4\" fill=\"#D56A4A\"/>");
    text(s,62,152,59,"#23211F","780","JIAWEI WANG");
    text(s,64,190,19,"#5A5550","640","Algorithm Research · AI Systems · Full-Stack Engineering");
    text(s,64,239,24,"#302D2A","700","I train models, build agents,");
    text(s,64,271,24,"#302D2A","700","and engineer the harness around them.");
    text(s,64,314,14.5,"#797169","520","Multimodal AI · Search, Ads &amp; Recommendation · Agent Post-Training · Harness Engineering");
    pill(s,62,344,148,"#252321","#FBF8F3","View selected work");
    pill(s,222,344,190,"#F7F0E6","#615A53","Information Sciences 2026");
    text(s,64,421,11.5,"#9B9289","560","Researcher when the loss converges. Engineer when it doesn't.");
    s.append("<g transform=\"translate(735 46)\">");
    s.append("<ellipse cx=\"224\" cy=\"365\" rx=\"186\" ry=\"33\" fill=\"#655649\" opacity=\".14\"/>");
    monitor(s); person(s); desk(s); annotations(s);
    s.append("</g></svg>");
    return s.toString();
  }
  private static void monitor(StringBuilder s){
    s.append("""
<g transform="translate(236 55)"><rect width="195" height="138" rx="18" fill="#E9DED0" stroke="#CFC2B4"/><rect x="10" y="10" width="175" height="112" rx="12" fill="#1C201E"/>
<rect x="29" y="31" width="80" height="6" rx="3" fill="#D56A4A"><animate attributeName="width" values="54;93;67;80" dur="3.4s" repeatCount="indefinite"/></rect>
<rect x="29" y="49" width="118" height="5" rx="3" fill="#A7B7A9"><animate attributeName="opacity" values=".4;.9;.55;.75" dur="2.7s" repeatCount="indefinite"/></rect>
<rect x="29" y="67" width="92" height="5" rx="3" fill="#D9D0C3" opacity=".6"/><rect x="29" y="84" width="126" height="5" rx="3" fill="#BEB2A4" opacity=".5"/>
<path d="M86 138 L114 138 L126 190 L74 190 Z" fill="#BEB3A8"/><rect x="58" y="188" width="84" height="10" rx="5" fill="#D8CEC3"/></g>
""");
  }
  private static void person(StringBuilder s){
    s.append("""
<rect x="93" y="172" width="151" height="156" rx="62" fill="#C8B9A8"/><rect x="112" y="188" width="114" height="126" rx="50" fill="#BCAA97"/>
<g><animateTransform attributeName="transform" type="translate" values="0 0;0 2;0 0" dur="3.8s" repeatCount="indefinite"/>
<path d="M108 210 C121 183 147 169 183 170 C222 171 247 193 258 226 L271 322 C239 343 128 344 91 322 Z" fill="url(#shirt)"/>
<path d="M163 170 L164 196 C177 206 197 206 208 195 L207 166 Z" fill="url(#skin)"/>
<g><animateTransform attributeName="transform" type="rotate" values="0 185 120;1.1 185 120;0 185 120;-0.6 185 120;0 185 120" dur="5.8s" repeatCount="indefinite"/>
<path d="M132 88 C137 50 163 31 193 32 C228 33 252 57 252 93 L246 135 C241 162 220 179 188 181 C155 181 134 161 129 135 Z" fill="url(#skin)"/>
<path d="M132 93 C130 55 154 28 188 27 C199 27 208 29 217 33 C201 38 191 49 184 64 C175 49 159 41 143 43 C132 56 127 73 132 93 Z" fill="#202124"/>
<path d="M184 64 C193 46 211 36 228 42 C246 56 254 76 251 98 C242 88 235 75 230 61 C211 59 198 63 184 73 Z" fill="#151618"/>
<path d="M150 102 L174 96 M204 96 L229 102" stroke="#34302D" stroke-width="5" stroke-linecap="round"/>
<path d="M150 113 C158 110 168 110 176 113" fill="none" stroke="#332F2C" stroke-width="2.4"><animate attributeName="d" values="M150 113 C158 110 168 110 176 113;M150 113 C158 113 168 113 176 113;M150 113 C158 110 168 110 176 113" dur="4.7s" repeatCount="indefinite"/></path>
<path d="M202 113 C210 110 220 110 228 113" fill="none" stroke="#332F2C" stroke-width="2.4"><animate attributeName="d" values="M202 113 C210 110 220 110 228 113;M202 113 C210 113 220 113 228 113;M202 113 C210 110 220 110 228 113" dur="4.7s" repeatCount="indefinite"/></path>
<path d="M189 116 L185 135 L193 137" fill="none" stroke="#B8795E" stroke-width="2"/><path d="M174 149 C184 154 197 154 207 148" fill="none" stroke="#8F5F52" stroke-width="2"/>
</g>
<path d="M145 184 C149 219 218 225 229 183" fill="none" stroke="url(#metal)" stroke-width="9" stroke-linecap="round"/><rect x="137" y="183" width="17" height="34" rx="8" fill="url(#metal)"/><rect x="222" y="183" width="17" height="34" rx="8" fill="url(#metal)"/>
<g><animateTransform attributeName="transform" type="rotate" values="0 124 245;2.5 124 245;0 124 245;-1.5 124 245;0 124 245" dur=".82s" repeatCount="indefinite"/><path d="M121 242 C110 273 111 294 131 312" fill="none" stroke="#232429" stroke-width="26" stroke-linecap="round"/><path d="M130 309 C145 315 155 319 169 320" fill="none" stroke="url(#skin)" stroke-width="15" stroke-linecap="round"/></g>
<g><animateTransform attributeName="transform" type="rotate" values="0 246 244;-2.3 246 244;0 246 244;1.2 246 244;0 246 244" dur=".76s" repeatCount="indefinite"/><path d="M244 241 C262 271 260 293 243 309" fill="none" stroke="#232429" stroke-width="26" stroke-linecap="round"/><path d="M244 308 C227 316 216 319 201 320" fill="none" stroke="url(#skin)" stroke-width="15" stroke-linecap="round"/></g></g>
""");
  }
  private static void desk(StringBuilder s){s.append("<path d=\"M24 327 L410 327 L445 374 L-6 374 Z\" fill=\"#A78F79\"/><path d=\"M127 320 L268 320 L293 340 L111 340 Z\" fill=\"#6C6A67\"/><circle cx=\"330\" cy=\"338\" r=\"23\" fill=\"#E9DFD4\"/>");}
  private static void annotations(StringBuilder s){
    s.append("<g font-family=\"").append(FONT).append("\"><g transform=\"translate(4 40)\"><rect width=\"100\" height=\"46\" rx=\"14\" fill=\"#FFF\" opacity=\".85\" stroke=\"#E1D6C9\"/>");
    text(s,18,19,9,"#9B9086","700","MODE"); text(s,18,35,12,"#393532","700","shipping");
    s.append("</g><g transform=\"translate(329 229)\"><rect width=\"111\" height=\"51\" rx=\"14\" fill=\"#FFF\" opacity=\".85\" stroke=\"#E1D6C9\"/><circle cx=\"18\" cy=\"18\" r=\"5\" fill=\"#8EA99B\"><animate attributeName=\"opacity\" values=\".35;1;.35\" dur=\"1.8s\" repeatCount=\"indefinite\"/></circle>");
    text(s,31,21,9.5,"#6D655E","700","HARNESS"); text(s,15,39,12,"#34302D","700","verified"); s.append("</g></g>");
  }
  private static void pill(StringBuilder s,double x,double y,double w,String fill,String fg,String label){s.append("<rect x=\"").append(x).append("\" y=\"").append(y).append("\" width=\"").append(w).append("\" height=\"36\" rx=\"18\" fill=\"").append(fill).append("\" stroke=\"#DCCFC1\"/>");text(s,x+w/2,y+23,12.5,fg,"700",label,"middle");}
  private static void text(StringBuilder s,double x,double y,double size,String fill,String weight,String value){text(s,x,y,size,fill,weight,value,"start");}
  private static void text(StringBuilder s,double x,double y,double size,String fill,String weight,String value,String anchor){s.append("<text x=\"").append(x).append("\" y=\"").append(y).append("\" fill=\"").append(fill).append("\" font-family=\"").append(FONT).append("\" font-size=\"").append(size).append("\" font-weight=\"").append(weight).append("\" text-anchor=\"").append(anchor).append("\">").append(value).append("</text>");}
}
