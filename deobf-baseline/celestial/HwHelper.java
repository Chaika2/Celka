package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class HwHelper extends Module {
   public Object[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static String[] id_throws;

   public HwHelper() {
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_protected[0]]);
      this.id_else();
      ArrayList var5 = new ArrayList();
      this.id_break[id_protected[1]] = var5;
      rrpt_3 var6 = this.id_class(new rrpt_3(this));
      this.id_break[id_protected[2]] = var6;
      rrpg_3 var7 = this.id_class(new rrpg_3(this));
      this.id_break[id_protected[3]] = var7;
      rrpp_3 var8 = this.id_class(new rrpp_3(this));
      this.id_break[id_protected[4]] = var8;
      rrpf_3 var9 = this.id_class(new rrpf_3(this));
      this.id_break[id_protected[5]] = var9;
      rrpU_2 var10 = this.id_class(new rrpU_2(this));
      this.id_break[id_protected[6]] = var10;
      rrpo_3 var11 = this.id_class(new rrpo_3(this));
      this.id_break[id_protected[7]] = var11;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new short[]{4, 0, 1, 2, 3, 4, 5, 6, 0, 0, 0, 0};
   }

   @Override
   public void id_class(boolean var1) {
      this.id_else();
      super.id_class(var1);

      for (rrTF var3 : (List)this.id_break[id_protected[8]]) {
         var3.aI_();
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2772057757312276803L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 240166308;
   }

   public <T extends rrTF<?>> T id_class(T var1) {
      this.id_else();
      ((List)this.id_break[id_protected[10]]).add(var1);
      return (T)var1;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-10, -54, 108, -17, 98, 47, -103, -108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_else();
      super.id_throws(var1);

      for (rrTF var3 : (List)this.id_break[id_protected[9]]) {
         var3.aK_();
      }
   }

   private static void id_continue() {
      id_byte = new byte[]{7};
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   public List<rrTF<?>> id_new() {
      this.id_else();
      return (List<rrTF<?>>)this.id_break[id_protected[11]];
   }

   private static void id_super() {
      id_throws = new String[]{new String("HW Helper"), new String("Утилитарный модуль для\nHolyWorld")};
   }
}
