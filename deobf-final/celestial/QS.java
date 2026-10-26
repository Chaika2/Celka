package celestial;

public class QS {
   public static final QS[] class_ = new QS[64];
   public static final QS break_ = new QS(0, 0);
   public static final QS byte_ = new QS(1, 8368696);
   public static final QS protected_ = new QS(2, 16247203);
   public static final QS throws_ = new QS(3, 13092807);
   public static final QS case_ = new QS(4, 16711680);
   public static final QS catch_ = new QS(5, 10526975);
   public static final QS private_ = new QS(6, 10987431);
   public static final QS implements_ = new QS(7, 31744);
   public static final QS finally_ = new QS(8, 16777215);
   public static final QS extends_ = new QS(9, 10791096);
   public static final QS native_ = new QS(10, 9923917);
   public static final QS volatile_ = new QS(11, 7368816);
   public static final QS final_ = new QS(12, 4210943);
   public static final QS package_ = new QS(13, 9402184);
   public static final QS int_ = new QS(14, 16776437);
   public static final QS new_ = new QS(15, 14188339);
   public static final QS continue_ = new QS(16, 11685080);
   public static final QS super_ = new QS(17, 6724056);
   public static final QS this_ = new QS(18, 15066419);
   public static final QS else_ = new QS(19, 8375321);
   public static final QS synchronized_ = new QS(20, 15892389);
   public static final QS return_ = new QS(21, 5000268);
   public static final QS public_ = new QS(22, 10066329);
   public static final QS goto_ = new QS(23, 5013401);
   public static final QS while_ = new QS(24, 8339378);
   public static final QS try_ = new QS(25, 3361970);
   public static final QS instanceof_ = new QS(26, 6704179);
   public static final QS throw_ = new QS(27, 6717235);
   public static final QS interface_ = new QS(28, 10040115);
   public static final QS char_ = new QS(29, 1644825);
   public static final QS abstract_ = new QS(30, 16445005);
   public static final QS long_ = new QS(31, 6085589);
   public static final QS float_ = new QS(32, 4882687);
   public static final QS void_ = new QS(33, 55610);
   public static final QS static_ = new QS(34, 8476209);
   public static final QS import_ = new QS(35, 7340544);
   public static final QS short_ = new QS(36, 13742497);
   public static final QS default_ = new QS(37, 10441252);
   public static final QS const_ = new QS(38, 9787244);
   public static final QS strictfp_ = new QS(39, 7367818);
   public static final QS boolean_ = new QS(40, 12223780);
   public static final QS transient_ = new QS(41, 6780213);
   public static final QS for_ = new QS(42, 10505550);
   public static final QS double_ = new QS(43, 3746083);
   public static final QS switch_ = new QS(44, 8874850);
   public static final QS r = new QS(45, 5725276);
   public static final QS P = new QS(46, 8014168);
   public static final QS B = new QS(47, 4996700);
   public static final QS S = new QS(48, 4993571);
   public static final QS s = new QS(49, 5001770);
   public static final QS E = new QS(50, 9321518);
   public static final QS G = new QS(51, 2430480);
   public static final QS b = new QS(52, 12398641);
   public static final QS M = new QS(53, 9715553);
   public static final QS O = new QS(54, 6035741);
   public static final QS h = new QS(55, 1474182);
   public static final QS X = new QS(56, 3837580);
   public static final QS J = new QS(57, 5647422);
   public static final QS x = new QS(58, 1356933);
   public int d;
   public final int k;

   private QS(int var1, int var2) {
      if (var1 >= 0 && var1 <= 63) {
         this.k = var1;
         this.d = var2;
         class_[var1] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int class_(int var1) {
      short var2 = 220;
      if (var1 == 3) {
         var2 = 135;
      }

      if (var1 == 2) {
         var2 = 255;
      }

      if (var1 == 1) {
         var2 = 220;
      }

      if (var1 == 0) {
         var2 = 180;
      }

      int var3 = (this.d >> 16 & 0xFF) * var2 / 255;
      int var4 = (this.d >> 8 & 0xFF) * var2 / 255;
      int var5 = (this.d & 0xFF) * var2 / 255;
      return 0xFF000000 | var5 << 16 | var4 << 8 | var3;
   }
}
