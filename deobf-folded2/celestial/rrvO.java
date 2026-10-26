package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvO extends rrtN_2 {
   private static float[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static String[] id_native;
   private static int[] id_volatile;

   @Override
   public String id_byte() {
      this.id_super();
      return ((rrZi_1)this.id_class[0]).id_private().id_final();
   }

   public rrvO(rrZi_1 var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, () -> 140.0F, () -> 14.0F);
      this.id_super();
      this.id_class[0] = var1;
      Module var4 = var1.id_private();
      if (!(var4 instanceof rrnv_3)) {
         rrIF var5 = new rrIF("Бинд", var4.id_package()).id_break(var4::id_package).id_class((var1x, var2x) -> {
            if (!var4.id_package().equals(var1x)) {
               var4.id_class(var1x, !var2x ? true : id_byte[6]);
            }
         });
         this.id_class(var5);
         if (var4 instanceof rrnZ_2) {
            rrIk_1 var6 = new rrIk_1("Выкл. при флаге", var4.id_implements()).id_class("disable_on_flag", (var1x, var2x) -> {
               if (!(Boolean)var2x.getRight()) {
                  var4.id_class(!var4.id_implements() ? true : id_byte[3], id_byte[4]);
               }
            });
            this.id_class(var6);
         }
      }

      this.id_switch();
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new short[2];
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.id_class(var1, var2, var3, var4, var5);
      float var6 = this.id_default();
      float var7 = this.id_abstract();
      this.id_interface().id_class(var1, () -> {
         if (!var5) {
            rrfD_2.id_class(var1, rrZL.id_protected, var6 + 1.5F, var7 + 1.5F, 10.0F, 10.0F, -657931);
         }
      }, var2, var3, var4, false, var5);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1001926494;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, -62, 22, 37, 89, 59, -79, 60}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8955731288560624786L;
   }

   private static void id_class() {
      id_byte = new boolean[]{false, true, true, false, true, true, false, true};
   }

   @Override
   public String id_catch() {
      return "ModuleMiscSettingPopUp";
   }

   private static void id_continue() {
      id_volatile = new int[]{-657931};
   }

   private static void id_package() {
      id_break = new float[]{1.5F, 1.5F, 10.0F, 10.0F, 14.0F, 140.0F};
   }

   private static void id_return() {
      id_native = new String[]{new String("Бинд"), new String("Выкл. при флаге"), new String("disable_on_flag"), new String("ModuleMiscSettingPopUp")};
   }

   private void id_super() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   @Override
   public boolean id_protected() {
      return true;
   }
}
