package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoAccept extends Module {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_break;
   private static String[] id_throws;

   public AutoAccept() {
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_super();
      ArrayList var5 = new ArrayList();
      this.id_break[id_protected[1]] = var5;
      this.id_class(new rrlt_3(this));
      this.id_class(new rrlq_3(this));
      this.id_class(new rrlp_3(this));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new boolean[]{true, false, true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1269182477;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_super();
      super.id_class(var1);

      for (rrTF var3 : (List)this.id_break[id_protected[2]]) {
         var3.aI_();
      }
   }

   public <T extends rrTF<?>> T id_class(T var1) {
      this.id_super();
      ((List)this.id_break[id_protected[5]]).add(var1);
      return (T)var1;
   }

   public boolean id_class(String[] var1) {
      Set var2 = Arrays.stream(var1).map(String::toLowerCase).collect(Collectors.toSet());
      Set var3 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_protected[4]]).id_class().keySet();

      for (String var5 : var2) {
         if (var3.contains(var5)) {
            return true;
         }
      }

      return id_byte[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7989256214832006234L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, 126, -100, -89, -97, 56, 99, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);

      for (rrTF var3 : (List)this.id_break[id_protected[3]]) {
         var3.aK_();
      }
   }

   private static void id_continue() {
      id_throws = new String[]{new String("Auto Accept"), new String("Автоматически принимает\nзапросы на что-либо")};
   }

   private static void id_new() {
      id_protected = new short[]{4, 0, 0, 0, 0, 0};
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }
}
