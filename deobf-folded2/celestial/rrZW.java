package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrZW implements MinecraftAccessor {
   private static short[] shortsf09fd5e6d24c37ccb4408917cb188133;
   private static byte[] bytesf09fd5e6d24c37ccb4408917cb188133;
   private static String[] stringsf09fd5e6d24c37ccb4408917cb188133;
   public static Object[] staticFieldsf09fd5e6d24c37ccb4408917cb188133;
   private static boolean[] booleansf09fd5e6d24c37ccb4408917cb188133;
   public Object[] fieldsf09fd5e6d24c37ccb4408917cb188133;

   public List<rrZz_1> id_byte() {
      return (List<rrZz_1>)this.fieldsf09fd5e6d24c37ccb4408917cb188133[1];
   }

   public void id_byte(String var1) {
      String var2 = var1.toLowerCase();
      rrZk_1 var3 = (rrZk_1)((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).remove(var2);
      if (var3 == null) {
         ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[1]).forEach(var1x -> var1x.id_class(var1));
      } else {
         ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[1]).forEach(var1x -> var1x.id_break(var3, true));
      }
   }

   private rrZW() {
      this.id_private();
      HashMap var7 = new HashMap();
      this.fieldsf09fd5e6d24c37ccb4408917cb188133[0] = var7;
      ArrayList var8 = new ArrayList();
      this.fieldsf09fd5e6d24c37ccb4408917cb188133[1] = var8;
      ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[1]).add(new rrZQ());
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4135506404061322121L;
   }

   public void id_class(Consumer<rrZk_1> var1) {
      if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).isEmpty()) {
         ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[1]).forEach(rrZz_1::id_byte);
      } else {
         ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).values().forEach(var1);
      }
   }

   public boolean id_class(an_3 var1) {
      if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).isEmpty()) {
         return false;
      } else {
         String var2 = var1.id_extends().toLowerCase();
         return ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).containsKey(var2);
      }
   }

   public Map<String, rrZk_1> id_class() {
      return (Map<String, rrZk_1>)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0];
   }

   public boolean id_class(Aw_1 var1) {
      if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).isEmpty()) {
         return false;
      } else {
         String var2 = var1.id_class().getName().toLowerCase();
         return ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).containsKey(var2);
      }
   }

   public void id_class(rrZk_1 var1, boolean var2) {
      String var3 = var1.id_class();
      if (var3.length() > 16 || var3.length() < 2) {
         ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[1]).forEach(rrZz_1::id_class);
      } else if (var3.equalsIgnoreCase(id_import.id_while().id_byte())) {
         ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[1]).forEach(rrZz_1::id_protected);
      } else {
         String var4 = var3.toLowerCase();
         boolean var5 = ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).putIfAbsent(var4, var1) == null
            ? true
            : booleansf09fd5e6d24c37ccb4408917cb188133[1];
         if (var2) {
            ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[1]).forEach(var2x -> var2x.id_class(var1, var5));
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -11414394;
   }

   public rrZk_1 id_class(String var1) {
      if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).isEmpty()) {
         return null;
      } else {
         String var2 = var1.toLowerCase();
         return (rrZk_1)((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).get(var2);
      }
   }

   public boolean id_break(String var1) {
      if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).isEmpty()) {
         return false;
      } else {
         String var2 = var1.toLowerCase();
         return ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).containsKey(var2);
      }
   }

   public int id_break() {
      return ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).size();
   }

   private static void id_throws() {
      booleansf09fd5e6d24c37ccb4408917cb188133 = new boolean[]{true, false, false, false, false, true, true, false, false, false, true};
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new rrZW(), null};
      var0[1] = new rrZW[]{(rrZW)var0[0]};
      staticFieldsf09fd5e6d24c37ccb4408917cb188133 = var0;
   }

   private static void id_catch() {
      shortsf09fd5e6d24c37ccb4408917cb188133 = new short[]{1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0};
   }

   private static void id_extends() {
      stringsf09fd5e6d24c37ccb4408917cb188133 = new String[]{new String("INSTANCE")};
   }

   private static void id_case() {
      bytesf09fd5e6d24c37ccb4408917cb188133 = new byte[]{16, 2, 2, 2};
   }

   public void id_protected() {
      if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).isEmpty()) {
         ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[1]).forEach(rrZz_1::id_byte);
      } else {
         ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[0]).clear();
         ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[1]).forEach(rrZz_1::id_break);
      }
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, -17, -33, -4, -80, -42, -86, 15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_private() {
      if (this.fieldsf09fd5e6d24c37ccb4408917cb188133 == null) {
         this.fieldsf09fd5e6d24c37ccb4408917cb188133 = new Object[2];
         Object[] var1 = this.fieldsf09fd5e6d24c37ccb4408917cb188133;
      }
   }
}
