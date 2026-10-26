package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrty_3 extends rrtm_3 {
   private static String[] id_protected;
   private static short[] id_throws;
   private static float[] id_native;
   private static byte[] id_volatile;
   public Object[] id_byte;
   private static boolean[] id_final;

   private static void id_long() {
      id_final = new boolean[]{true, false, false, false, false, false};
   }

   private static void id_float() {
      id_native = new float[]{0.2F, 5.0F, 12.0F, 16.5F, 4.5F, 40.5F, 12.0F, 90.0F, 8.0F, 8.0F, 4.0F, 2.0F, 0.0F, 90.0F, 270.0F, 180.0F};
   }

   public rrty_3(rrtN_2 var1, ButtonSetting var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.id_while();
      rruL var12 = new rruL();
      this.id_byte[2] = var12;
      this.id_byte[0] = var1;
      this.id_byte[1] = var2;
      Supplier var7 = () -> new rji_3(
            (float)ColorHelper.id_class(0.0F), (float)ColorHelper.id_class(90.0F), (float)ColorHelper.id_class(270.0F), (float)ColorHelper.id_class(180.0F)
         );
      ((rruL)this.id_byte[2])
         .id_class(
            new rruF(
                  var1,
                  new rruH(
                        () -> rrZL.id_extends,
                        () -> new rjK_2(4.0F, 2.0F),
                        () -> new rjK_2(8.0F, 8.0F),
                        () -> rrZF.d_,
                        ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally(),
                        () -> "Load",
                        () -> {
                           rruv_1 var1x = this.id_volatile();
                           return new rjK_2(var1x.id_break() + 90.0F, var1x.id_protected());
                        },
                        () -> new rjK_2(40.5F, 12.0F),
                        () -> new rjK_2(16.5F, 4.5F),
                        () -> rrZF.d_,
                        var7
                     )
                     .<rrup_1>id_break(ClickGuiTheme::id_class)
                     .id_class(0.2F)
               )
               .id_class(
                  () -> {
                     this.id_while();
                     ((ButtonSetting)this.id_byte[1]).id_break().run();
                     ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
                        .id_class(
                           new rrtQ_2(
                              ((ButtonSetting)this.id_byte[1]).id_class().id_final(),
                              "Конфиг '" + ((ButtonSetting)this.id_byte[1]).id_throws() + "' загружен",
                              1500
                           )
                        );
                  }
               )
         );
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_while();
      return super.id_class(var1, var2, var3, var4, var5) ? ((rruL)this.id_byte[2]).id_class(var1, var2, var3, var4, false) : id_final[5];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4414909475423555842L;
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      super.id_class(var1, var2, var3, var4);
      float var5 = this.id_package();
      float var6 = this.id_final();
      this.id_private().id_interface().id_class(var1, () -> this.id_break(var1, var2, var5, var6, var3, var4));
   }

   private void id_break(Ml_1 var1, rrtu_3 var2, float var3, float var4, int var5, int var6) {
      this.id_while();
      rrZO var7 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally();
      rrtF_2.id_protected(var1, this, var7, ((ButtonSetting)this.id_byte[1]).id_throws(), var3, var4, rrZF.k_, 255);
      ((rruL)this.id_byte[2]).id_class(var1, var2, var5, var6, false, false);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 595751198;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, -51, -83, 109, 73, 115, -50, 113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Setting<Runnable> id_finally() {
      this.id_while();
      return (ButtonSetting)this.id_byte[1];
   }

   private static void id_instanceof() {
      id_throws = new short[]{2, 0, 1, 2, 0, 0, 1, 255, 2, 2, 0, 1, 0, 1, 0, 1, 1, 1500};
   }

   private static void id_throw() {
      id_protected = new String[]{new String("Load")};
   }

   private void id_while() {
      if (this.id_byte == null) {
         this.id_byte = new Object[3];
         Object[] var1 = this.id_byte;
      }
   }

   @Override
   public rrtN_2 id_private() {
      this.id_while();
      return (rrtN_2)this.id_byte[0];
   }

   @Override
   public rruv_1 id_volatile() {
      this.id_while();
      return new rruv_1(this.id_package(), this.id_final() - 5.0F, ((rrtN_2)this.id_byte[0]).id_implements(), 12.0F);
   }

   private static void id_synchronized() {
      id_volatile = new byte[]{3};
   }
}
