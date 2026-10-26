package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQl_1 extends vm_3 {
   private static boolean[] id_throws;
   private static byte[] id_case;
   private static short[] id_catch;
   private static int[] id_private;
   public Object[] id_class;
   private static String[] id_implements;

   private static void id_int() {
      id_throws = new boolean[]{true, false, false, false, false, false};
   }

   public rrQl_1(rrQC var1, vm_3 var2) {
      super(new rgn_3(id_implements[0]));
      this.id_package();
      Object var7 = null;
      this.id_class[2] = var7;
      this.id_class[1] = var2;
      this.id_class[id_catch[2]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_catch = new short[]{2, 1, 0, 2, 0, 128, 128, 0, 128, 128, 0, 128, 128, 2, 2, 1, 0, 1, 0, 1, 0, 1};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4994430456756837262L;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_package();
      this.id_class(var1);
      this.id_super.id_class(var1, this.id_extends, this.id_package / 2, this.id_int / 2 - 27, 16777215);
      if ((rgP_2)this.id_class[2] != null) {
         this.id_super.id_class(var1, (rgP_2)this.id_class[2], this.id_package / 2, this.id_int / 2 - 47, 10526880);
      }

      super.id_class(var1, var2, var3, var4);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, 109, -80, 35, -110, 80, -46, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1804413931;
   }

   private static void id_finally() {
      id_implements = new String[]{
         new String("gui.authme.method.title"),
         new String("gui.authme.method.greeting"),
         new String("gui.authme.method.button.microsoft"),
         new String("gui.authme.method.button.mojang"),
         new String("gui.authme.method.button.offline"),
         new String("gui.back"),
         new String("gui.authme.method.button.offline"),
         new String("gui.authme.method.button.mojang"),
         new String("gui.authme.method.button.microsoft")
      };
   }

   private void id_package() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_final() {
      id_case = new byte[]{
         2, 20, 10, 4, 2, 5, 20, 20, 20, 2, 10, 2, 5, 20, 20, 20, 20, 2, 10, 4, 2, 5, 20, 20, 40, 20, 2, 50, 2, 27, 100, 20, 2, 2, 27, 2, 2, 47, 3
      };
   }

   @Override
   public void id_volatile() {
      this.id_package();
      super.id_volatile();
      id_import.id_break((vm_3)this.id_class[1]);
   }

   private static void id_native() {
      id_private = new int[]{16777215, 10526880};
   }

   @Override
   public void v_() {
      this.id_package();
      super.v_();
      String var10003 = id_implements[1];
      Object[] var10004 = new Object[1];
      var10004[id_throws[1]] = new rgN_2(rrQg_1.id_protected().id_byte()).id_class(rgF_2.YELLOW);
      rgn_3 var5 = new rgn_3(var10003, var10004);
      this.id_class[2] = var5;
      this.id_class(
         new Ll_1(
            this.id_package / 2 - 20 - 10 - 4,
            this.id_int / 2 - 5,
            20,
            20,
            id_throws[2],
            id_throws[3],
            20,
            (rqO_2)rrQI.id_class[id_catch[4]],
            128,
            128,
            var1 -> {
               this.id_package();
               id_import.id_break(new rrQy_1((rrQC)this.id_class[id_catch[20]], this, (vm_3)this.id_class[1]));
            },
            (var1, var2, var3, var4) -> this.id_class(var2, new rgn_3(id_implements[8]), var3, var4),
            new rgn_3(id_implements[2])
         )
      );
      this.id_class(
         new Ll_1(this.id_package / 2 - 10, this.id_int / 2 - 5, 20, 20, 20, id_throws[4], 20, (rqO_2)rrQI.id_class[id_catch[7]], 128, 128, var1 -> {
            this.id_package();
            id_import.id_break(new rrQp_1((rrQC)this.id_class[id_catch[18]], this, (vm_3)this.id_class[1]));
         }, (var1, var2, var3, var4) -> this.id_class(var2, new rgn_3(id_implements[7]), var3, var4), new rgn_3(id_implements[3]))
      );
      this.id_class(
         new Ll_1(this.id_package / 2 + 10 + 4, this.id_int / 2 - 5, 20, 20, 40, id_throws[5], 20, (rqO_2)rrQI.id_class[id_catch[10]], 128, 128, var1 -> {
            this.id_package();
            id_import.id_break(new rrQq_1((rrQC)this.id_class[id_catch[16]], this, (vm_3)this.id_class[1]));
         }, (var1, var2, var3, var4) -> this.id_class(var2, new rgn_3(id_implements[6]), var3, var4), new rgn_3(id_implements[4]))
      );
      this.id_class((LF)(new LF(this.id_package / 2 - 50, this.id_int / 2 + 27, 100, 20, new rgn_3(id_implements[5]), var1 -> this.id_volatile())));
   }
}
