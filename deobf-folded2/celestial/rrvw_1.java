package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrvw_1 {
   private static byte[] bytesb5a707e7713735c98363c6b6bc5591b6;
   private static String[] stringsb5a707e7713735c98363c6b6bc5591b6;
   private static short[] shortsb5a707e7713735c98363c6b6bc5591b6;
   public Object[] fieldsb5a707e7713735c98363c6b6bc5591b6;
   private static boolean[] booleansb5a707e7713735c98363c6b6bc5591b6;
   public static Object[] staticFieldsb5a707e7713735c98363c6b6bc5591b6;

   private rrvw_1() {
      this.id_throws();
      ArrayList var7 = new ArrayList();
      this.fieldsb5a707e7713735c98363c6b6bc5591b6[0] = var7;
      ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[0]).add(new rrvf_1());
   }

   static {
      ntfClinit();
   }

   public void id_class() {
      for (Module var2 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().g()) {
         var2.id_class(var2.ax_(), false);
      }

      ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[0]).forEach(rrvI::id_class);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, -32, 54, -81, 15, -46, 6, 27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 712074404;
   }

   public void id_class(Consumer<Module> var1) {
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().g().stream().allMatch(var0 -> var0.id_package().id_class())) {
         ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[0]).forEach(rrvI::id_break);
      } else {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .id_private()
            .g()
            .stream()
            .filter(var0 -> !var0.id_package().id_class() ? true : booleansb5a707e7713735c98363c6b6bc5591b6[3])
            .forEach(var1);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6456379061537898708L;
   }

   public void id_class(Module var1) {
      var1.id_class(var1.ax_(), false);
      ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[0]).forEach(var1x -> var1x.id_class(var1));
   }

   public List<rrvI> id_break() {
      return (List<rrvI>)this.fieldsb5a707e7713735c98363c6b6bc5591b6[0];
   }

   private void id_throws() {
      if (this.fieldsb5a707e7713735c98363c6b6bc5591b6 == null) {
         this.fieldsb5a707e7713735c98363c6b6bc5591b6 = new Object[1];
         Object[] var1 = this.fieldsb5a707e7713735c98363c6b6bc5591b6;
      }
   }

   private static void id_catch() {
      shortsb5a707e7713735c98363c6b6bc5591b6 = new short[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   }

   private static void id_case() {
      booleansb5a707e7713735c98363c6b6bc5591b6 = new boolean[]{false, false, true, false, true, false, false, false, true, true};
   }

   private static void id_implements() {
      stringsb5a707e7713735c98363c6b6bc5591b6 = new String[]{new String("INSTANCE")};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrvw_1(), null};
      var0[1] = new rrvw_1[]{(rrvw_1)var0[0]};
      staticFieldsb5a707e7713735c98363c6b6bc5591b6 = var0;
   }

   private static void id_private() {
      bytesb5a707e7713735c98363c6b6bc5591b6 = new byte[]{2};
   }
}
