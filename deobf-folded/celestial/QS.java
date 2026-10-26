package celestial;

public class QS {
   public static final QS[] id_class = new QS[64];
   public static final QS id_break = new QS(0, 0);
   public static final QS id_byte = new QS(1, 8368696);
   public static final QS id_protected = new QS(2, 16247203);
   public static final QS id_throws = new QS(3, 13092807);
   public static final QS id_case = new QS(4, 16711680);
   public static final QS id_catch = new QS(5, 10526975);
   public static final QS id_private = new QS(6, 10987431);
   public static final QS id_implements = new QS(7, 31744);
   public static final QS id_finally = new QS(8, 16777215);
   public static final QS id_extends = new QS(9, 10791096);
   public static final QS id_native = new QS(10, 9923917);
   public static final QS id_volatile = new QS(11, 7368816);
   public static final QS id_final = new QS(12, 4210943);
   public static final QS id_package = new QS(13, 9402184);
   public static final QS id_int = new QS(14, 16776437);
   public static final QS id_new = new QS(15, 14188339);
   public static final QS id_continue = new QS(16, 11685080);
   public static final QS id_super = new QS(17, 6724056);
   public static final QS id_this = new QS(18, 15066419);
   public static final QS id_else = new QS(19, 8375321);
   public static final QS id_synchronized = new QS(20, 15892389);
   public static final QS id_return = new QS(21, 5000268);
   public static final QS id_public = new QS(22, 10066329);
   public static final QS id_goto = new QS(23, 5013401);
   public static final QS id_while = new QS(24, 8339378);
   public static final QS id_try = new QS(25, 3361970);
   public static final QS id_instanceof = new QS(26, 6704179);
   public static final QS id_throw = new QS(27, 6717235);
   public static final QS id_interface = new QS(28, 10040115);
   public static final QS id_char = new QS(29, 1644825);
   public static final QS id_abstract = new QS(30, 16445005);
   public static final QS id_long = new QS(31, 6085589);
   public static final QS id_float = new QS(32, 4882687);
   public static final QS id_void = new QS(33, 55610);
   public static final QS id_static = new QS(34, 8476209);
   public static final QS id_import = new QS(35, 7340544);
   public static final QS id_short = new QS(36, 13742497);
   public static final QS id_default = new QS(37, 10441252);
   public static final QS id_const = new QS(38, 9787244);
   public static final QS id_strictfp = new QS(39, 7367818);
   public static final QS id_boolean = new QS(40, 12223780);
   public static final QS id_transient = new QS(41, 6780213);
   public static final QS id_for = new QS(42, 10505550);
   public static final QS id_double = new QS(43, 3746083);
   public static final QS id_switch = new QS(44, 8874850);
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
         id_class[var1] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int id_class(int var1) {
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
