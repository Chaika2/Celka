package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrqQ_2 implements MinecraftAccessor {
   private static short[] shortsaf585ffa18e23930a314cd0048f74bf2;
   public static Object[] staticFieldsaf585ffa18e23930a314cd0048f74bf2;
   private static byte[] bytesaf585ffa18e23930a314cd0048f74bf2;
   public Object[] fieldsaf585ffa18e23930a314cd0048f74bf2;
   private static String[] stringsaf585ffa18e23930a314cd0048f74bf2;
   private static boolean[] booleansaf585ffa18e23930a314cd0048f74bf2;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{16, -44, 87, 115, -71, 74, 113, 19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_byte() {
      if (((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[9]]).isEmpty()) {
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(rrqd_3::f_);
      } else {
         ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[11]]).clear();
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(rrqd_3::g_);
      }
   }

   private rrqQ_2() {
      this.id_extends();
      HashSet var7 = new HashSet();
      this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[1]] = var7;
      ArrayList var8 = new ArrayList();
      this.fieldsaf585ffa18e23930a314cd0048f74bf2[1] = var8;
      this.id_break(new rrqv_3());
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7225774521757023521L;
   }

   public void id_class(Consumer<rrqz_3> var1) {
      if (((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[13]]).isEmpty()) {
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(rrqd_3::f_);
      } else {
         ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[15]]).forEach(var1);
      }
   }

   public int id_class(xd_3 var1) {
      for (rrqz_3 var3 : (Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[19]]) {
         if (var3.id_byte() == var1) {
            return var3.id_class();
         }
      }

      return -1;
   }

   public void id_class(Collection<rrqz_3> var1) {
      ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var1x -> var1x.id_class(var1));
   }

   public void id_class(rrqz_3 var1, String var2, boolean var3) {
      if (var1.id_byte() == xu_3.id_class) {
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var1x -> var1x.id_class(var2, new u_1(stringsaf585ffa18e23930a314cd0048f74bf2[0])));
      } else {
         boolean var4 = ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[4]]).add(var1);
         if (var3) {
            ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var2x -> var2x.id_class(var1, var4));
         }
      }
   }

   public void id_class(rrqd_3 var1) {
      ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).remove(var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 272204212;
   }

   public void id_class() {
      XRay var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shortsaf585ffa18e23930a314cd0048f74bf2[17]]).id_private().x();
      var1.id_case(!var1.id_continue() ? true : booleansaf585ffa18e23930a314cd0048f74bf2[2]);
      ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var1x -> var1x.g_(var1.id_continue()));
   }

   public boolean id_class(String var1) {
      rrqz_3 var2 = this.id_break(var1);
      if (var2 == null) {
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var1x -> var1x.a_(var1));
         return booleansaf585ffa18e23930a314cd0048f74bf2[0];
      } else {
         boolean var3 = ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[7]]).remove(var2);
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var2x -> var2x.id_break(var2, var3));
         return var3;
      }
   }

   public boolean id_break(xd_3 var1) {
      for (rrqz_3 var3 : (Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[20]]) {
         if (var3.id_byte() == var1) {
            return true;
         }
      }

      return booleansaf585ffa18e23930a314cd0048f74bf2[4];
   }

   public rrqz_3 id_break(String var1) {
      for (rrqz_3 var3 : (Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[21]]) {
         if (ri_3.id_class(var3.id_byte()).equalsIgnoreCase(ri_3.id_class(ri_3.id_class(var1)))) {
            return var3;
         }
      }

      return null;
   }

   public void id_break(rrqd_3 var1) {
      ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).add(var1);
   }

   public Set<rrqz_3> id_break() {
      return (Set<rrqz_3>)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[24]];
   }

   private static void id_throws() {
      shortsaf585ffa18e23930a314cd0048f74bf2 = new short[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0};
   }

   private static void id_finally() {
      booleansaf585ffa18e23930a314cd0048f74bf2 = new boolean[]{false, true, false, true, false, true, false, false, false, true};
   }

   private static void id_catch() {
      bytesaf585ffa18e23930a314cd0048f74bf2 = new byte[]{-1, 2, 2};
   }

   private void id_extends() {
      if (this.fieldsaf585ffa18e23930a314cd0048f74bf2 == null) {
         this.fieldsaf585ffa18e23930a314cd0048f74bf2 = new Object[2];
      }
   }

   private static void id_case() {
      stringsaf585ffa18e23930a314cd0048f74bf2 = new String[]{new String("Block not found"), new String("INSTANCE")};
   }

   public List<rrqd_3> id_protected() {
      return (List<rrqd_3>)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1];
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrqQ_2(), null};
      var0[1] = new rrqQ_2[]{(rrqQ_2)var0[0]};
      staticFieldsaf585ffa18e23930a314cd0048f74bf2 = var0;
   }
}
