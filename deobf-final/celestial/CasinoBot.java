package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CasinoBot extends Module {
   private static short[] protected_;
   public Object[] break_;
   private static boolean[] throws_;
   public static Object[] byte_;
   private static byte[] catch_;
   private static double[] private_;
   private static String[] implements_;

   private boolean byte_(String var1) {
      return var1.startsWith("[$]") && var1.contains("получено от игрока") ? true : throws_[12];
   }

   public CasinoBot() {
      super("Casino", "Test", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.this_();
      rrfw_3 var5 = new rrfw_3();
      this.break_[0] = var5;
      CopyOnWriteArrayList var6 = new CopyOnWriteArrayList();
      this.break_[1] = var6;
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.this_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((rrfw_3)this.break_[0]).class_(32000.0)) {
            ((cb_3)import_.class_[57])
               .protected_(
                  String.format(
                     "!Привет! Я - ваш личный казино бот. Попробуйте свою удачу и отправьте мне деньги %s. Взамен, я отправлю вам сумму, умноженную на случайное число от 0 до 3. Мой текущий баланс - %s монет, количество игр: "
                        + (Integer)byte_[3],
                     "/pay " + ((cb_3)import_.class_[57]).sv().getName() + " сумма",
                     rql_3.class_(this.else_(), ' ')
                  )
               );
            ((rrfw_3)this.break_[0]).class_();
         }

         if (((List)this.break_[1]).isEmpty()) {
            return;
         }

         rrHL var2 = (rrHL)((List)this.break_[1]).get(0);
         if (var2.protected_()) {
            ((List)this.break_[1]).remove(0);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3622709375790498784L;
   }

   @EventTarget
   public void class_(rrLO var1) {
      this.this_();
      String var2 = var1.protected_();
      if (this.byte_(var2)) {
         Matcher var3 = ((Pattern)byte_[1]).matcher(var2);
         Matcher var4 = ((Pattern)byte_[0]).matcher(var2);
         if (var3.find() && var4.find()) {
            int var5 = Float.valueOf(var3.group(0).replace(",", "").substring(1)).intValue();
            String var6 = var4.group(1);
            if (var5 >= 2000) {
               ((List)this.break_[1]).add(new rrHL(this, var5, var6, new rrfw_3()));
            } else {
               ((cb_3)import_.class_[57]).protected_(String.format("/m %s %s", var6, String.format("Минимальная ставка от %s$", 2000)));
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -177454248;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, -34, 78, 92, 123, 47, -30, -97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void goto_() {
      implements_ = new String[]{
         new String("Casino"),
         new String("Test"),
         new String(","),
         new String(""),
         new String("/m %s %s"),
         new String("Минимальная ставка от %s$"),
         new String("[$]"),
         new String("получено от игрока"),
         new String("\\s([a-zA-Z0-9_]+)"),
         new String("\\$[0-9,]+")
      };
   }

   private static void continue_() {
      protected_ = new short[]{4, 0, 1, 0, 0, 57, 3, 57, 0, 1, 1, 1, 1, 0, 2000, 1, 57, 2000, 2000};
   }

   long else_() {
      return C_throws.byte_().native_().byte_();
   }

   private static void new_() {
      Object[] var0 = new Object[]{Pattern.compile("\\s([a-zA-Z0-9_]+)"), Pattern.compile("\\$[0-9,]+"), 2000, 0};
      byte_ = var0;
   }

   private static void return_() {
      throws_ = new boolean[]{false, true, false, false, false, true, true, false, true, true, false, true, false, false, true, false};
   }

   private static void super_() {
      catch_ = new byte[]{2, 32, 2, 2, 4, 2, 3};
   }

   private static void public_() {
      private_ = new double[]{32000.0};
   }
}
