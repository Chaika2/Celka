package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoUse extends Module {
   private static boolean[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;
   private static String[] id_throws;

   public AutoUse() {
      super("Auto Use", "Автоматически использует\nпредметы в нужный момент", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.id_super();
      ArrayList var5 = new ArrayList();
      this.id_break[0] = var5;
      this.id_break(new rrlV_2(this));
      this.id_break(new rrlf_3(this));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new boolean[]{true, false, true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -834626668;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6804091756383992238L;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_super();

      for (rrlg_3 var3 : (List)this.id_break[0]) {
         var3.aI_();
      }

      super.id_class(var1);
   }

   public boolean id_class(rrlg_3 var1) {
      this.id_super();

      for (rrlg_3 var3 : (List)this.id_break[0]) {
         if (var1 != var3 && !var3.id_throws()) {
            return true;
         }
      }

      return id_byte[1];
   }

   @EventTarget
   public void id_class(j_1 var1) {
      this.id_super();
      if (var1.id_class() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0]) {
         for (rrlg_3 var3 : (List)this.id_break[0]) {
            var3.id_protected();
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -127, -76, 15, -16, -5, -123, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public <T extends rrlg_3> void id_break(T var1) {
      this.id_super();
      ((List)this.id_break[0]).add(var1);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_super();

      for (rrlg_3 var3 : (List)this.id_break[0]) {
         var3.aK_();
         var3.id_protected();
      }

      super.id_throws(var1);
   }

   private static void id_continue() {
      id_throws = new String[]{new String("Auto Use"), new String("Автоматически использует\nпредметы в нужный момент")};
   }

   private static void id_new() {
      id_protected = new short[]{3, 0, 0, 0, 0, 0, 0, 0};
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }
}
