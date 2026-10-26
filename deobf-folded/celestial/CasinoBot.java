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
   private static short[] id_protected;
   public Object[] id_break;
   private static boolean[] id_throws;
   public static Object[] id_byte;
   private static byte[] id_catch;
   private static double[] id_private;
   private static String[] id_implements;

   private boolean id_byte(String var1) {
      return var1.startsWith(id_implements[6]) && var1.contains(id_implements[7]) ? true : id_throws[12];
   }

   public CasinoBot() {
      super(id_implements[0], id_implements[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_this();
      rrfw_3 var5 = new rrfw_3();
      this.id_break[id_protected[1]] = var5;
      CopyOnWriteArrayList var6 = new CopyOnWriteArrayList();
      this.id_break[1] = var6;
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_this();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[3]]) {
         if (((rrfw_3)this.id_break[id_protected[4]]).id_class(32000.0)) {
            cb_3 var10000 = (cb_3)id_import.id_class[57];
            String var10001 = "!Привет! Я - ваш личный казино бот. Попробуйте свою удачу и отправьте мне деньги %s. Взамен, я отправлю вам сумму, умноженную на случайное число от 0 до 3. Мой текущий баланс - %s монет, количество игр: "
               + (Integer)id_byte[3];
            Object[] var10002 = new Object[2];
            var10002[id_throws[0]] = "/pay " + ((cb_3)id_import.id_class[57]).sv().getName() + " сумма";
            var10002[1] = rql_3.id_class(this.id_else(), ' ');
            var10000.id_protected(String.format(var10001, var10002));
            ((rrfw_3)this.id_break[id_protected[8]]).id_class();
         }

         if (((List)this.id_break[1]).isEmpty()) {
            return;
         }

         rrHL var2 = (rrHL)((List)this.id_break[1]).get(id_throws[2]);
         if (var2.id_protected()) {
            ((List)this.id_break[1]).remove(id_throws[3]);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3622709375790498784L;
   }

   @EventTarget
   public void id_class(rrLO var1) {
      this.id_this();
      String var2 = var1.id_protected();
      if (this.id_byte(var2)) {
         Matcher var3 = ((Pattern)id_byte[1]).matcher(var2);
         Matcher var4 = ((Pattern)id_byte[id_protected[13]]).matcher(var2);
         if (var3.find() && var4.find()) {
            int var5 = Float.valueOf(var3.group(id_throws[4]).replace(id_implements[2], id_implements[3]).substring(1)).intValue();
            String var6 = var4.group(1);
            if (var5 >= 2000) {
               ((List)this.id_break[1]).add(new rrHL(this, var5, var6, new rrfw_3()));
            } else {
               cb_3 var10000 = (cb_3)id_import.id_class[57];
               String var10001 = id_implements[4];
               Object[] var10002 = new Object[2];
               var10002[id_throws[7]] = var6;
               String var10005 = id_implements[5];
               Object[] var10006 = new Object[1];
               var10006[id_throws[10]] = 2000;
               var10002[1] = String.format(var10005, var10006);
               var10000.id_protected(String.format(var10001, var10002));
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -177454248;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, -34, 78, 92, 123, 47, -30, -97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_goto() {
      id_implements = new String[]{
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

   private static void id_continue() {
      id_protected = new short[]{4, 0, 1, 0, 0, 57, 3, 57, 0, 1, 1, 1, 1, 0, 2000, 1, 57, 2000, 2000};
   }

   long id_else() {
      return C_throws.id_byte().id_native().id_byte();
   }

   private static void id_new() {
      Object[] var0 = new Object[]{Pattern.compile(id_implements[8]), Pattern.compile(id_implements[9]), 2000, 0};
      id_byte = var0;
   }

   private static void id_return() {
      id_throws = new boolean[]{false, true, false, false, false, true, true, false, true, true, false, true, false, false, true, false};
   }

   private static void id_super() {
      id_catch = new byte[]{2, 32, 2, 2, 4, 2, 3};
   }

   private static void id_public() {
      id_private = new double[]{32000.0};
   }
}
