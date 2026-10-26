package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZy_1 extends rrZN {
   private static float[] id_protected;
   private static String[] id_throws;
   private static boolean[] id_case;
   public static Object[] id_break;
   public Object[] id_byte;
   private static byte[] id_catch;
   private static short[] id_private;

   @Override
   public void id_byte(int var1, int var2, int var3) {
      this.id_else();
      super.id_byte(var1, var2, var3);
      ((rrtY_2)this.id_byte[id_private[12]]).id_byte(var1, var2, var3);
   }

   private static void id_int() {
      id_catch = new byte[]{4};
   }

   public rrZy_1(rrvJ var1) {
      this.id_else();
      AnimValue var6 = new AnimValue(id_protected[0], id_case[0]);
      this.id_byte[id_private[0]] = var6;
      this.id_byte[id_private[1]] = var1;
      rrtY_2 var8 = new rrtY_2(
         new rrIv_1(id_throws[0], (rrte_3)id_break[id_private[2]]).id_package(), (rrtK_2)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[id_private[3]]
      );
      this.id_byte[id_private[4]] = var8;
      ((rrtY_2)this.id_byte[id_private[5]]).id_class(() -> {
         this.id_else();
         return ((rrtY_2)this.id_byte[id_private[28]]).id_super() - id_protected[3];
      });
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      Object[] var0 = new Object[]{rrte_3.id_class(Pattern.compile(id_throws[1], 0))};
      id_break = var0;
   }

   @Override
   public boolean id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.id_else();
      ((AnimValue)this.id_byte[id_private[6]]).id_class(this.id_package());
      float var10 = id_protected[1] * ((AnimValue)this.id_byte[id_private[7]]).id_byte();
      return ((rrtY_2)this.id_byte[id_private[8]]).id_class(var1, var2, var3, var4, var5 - var10, var6, var7, var8, var9);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_else();
      boolean var4 = ((rrtY_2)this.id_byte[id_private[11]]).id_class(var1, var2, var3);
      this.id_volatile();
      return var4;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_else();
      if (!((rrtY_2)this.id_byte[id_private[9]]).id_class(var1, var2, var3, var4, var5)) {
         ((rrtY_2)this.id_byte[id_private[10]]).id_throws();
         return id_case[1];
      } else {
         return id_case[2];
      }
   }

   @Override
   public void id_class(Category var1, Category var2) {
      super.id_class(var1, var2);
      this.id_new();
   }

   @Override
   public boolean id_class(char var1, int var2) {
      this.id_else();
      boolean var3 = ((rrtY_2)this.id_byte[id_private[13]]).id_class(var1, var2);
      this.id_volatile();
      return var3;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3638119927961857032L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1557758448;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-79, -52, -21, -34, 42, 100, -4, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws() {
      this.id_else();
      super.id_throws();
      ((rrtY_2)this.id_byte[id_private[21]]).id_throws();
   }

   public AnimValue id_finally() {
      this.id_else();
      return (AnimValue)this.id_byte[id_private[27]];
   }

   @Override
   public void id_catch() {
      this.id_else();
      super.id_catch();
      ((rrtY_2)this.id_byte[id_private[22]]).id_catch();
   }

   public rrtY_2 id_extends() {
      this.id_else();
      return (rrtY_2)this.id_byte[id_private[26]];
   }

   private static void id_continue() {
      id_private = new short[]{2, 0, 0, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 0, 1, 1, 1, 1, 0, 1, 2, 1};
   }

   private void id_else() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_catch[0]];
         Object[] var1 = this.id_byte;
      }
   }

   private void id_new() {
      this.id_else();
      if ((Float)this.id_byte[id_private[17]] != null) {
         rrZH var1 = this.id_return();
         if (var1 != null) {
            var1.id_class((Float)this.id_byte[id_private[18]]);
         }

         Object var6 = null;
         this.id_byte[id_private[19]] = var6;
      }
   }

   private boolean id_package() {
      this.id_else();
      rrZN var1 = ((rrvJ)this.id_byte[id_private[25]]).id_native();
      return var1 instanceof rrZw_1;
   }

   private rrZH id_return() {
      this.id_else();
      return ((rrvJ)this.id_byte[id_private[20]]).id_native() instanceof rrZT var1 ? var1.id_case().id_extends() : null;
   }

   private static void id_super() {
      id_throws = new String[]{new String("Поиск"), new String("[a-zA-Zа-яА-Я0-9 -]+")};
   }

   @Override
   public void id_protected() {
      this.id_else();
      super.id_protected();
      ((rrtY_2)this.id_byte[id_private[24]]).id_protected();
   }

   @Override
   public void id_private() {
      this.id_else();
      super.id_private();
      this.id_new();
      ((rrtY_2)this.id_byte[id_private[23]]).id_private();
   }

   private void id_volatile() {
      this.id_else();
      rrZH var1 = this.id_return();
      if (var1 != null) {
         if (!((rrtY_2)this.id_byte[id_private[14]]).id_new()) {
            if ((Float)this.id_byte[id_private[15]] == null) {
               Float var6 = var1.id_break();
               this.id_byte[id_private[16]] = var6;
               var1.id_class(id_protected[2]);
            }
         } else {
            this.id_new();
         }
      }
   }

   private static void id_synchronized() {
      id_case = new boolean[]{false, false, false, false, true};
   }

   private static void id_native() {
      id_protected = new float[]{0.6F, 54.0F, 0.0F, 40.0F};
   }
}
