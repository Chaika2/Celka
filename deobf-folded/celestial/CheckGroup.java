package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CheckGroup {
   public Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   public List<rrIk_1> id_byte() {
      return new ArrayList<>(((Map)this.id_class[id_break[1]]).values());
   }

   public CheckGroup id_byte(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[3], var1);
   }

   public CheckGroup() {
      this.id_native();
      EnumMap var5 = new EnumMap<>(rrIA.class);
      this.id_class[id_break[0]] = var5;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-71, -66, -93, -30, -33, 88, 117, -81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public CheckGroup id_class(rrIA var1, boolean var2) {
      rrIk_1 var3 = new rrIk_1(var1.id_class(), var1.id_break());
      var3.id_class(Boolean.valueOf(var2), id_byte[0], true);
      if (var1 == (rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1]) {
         var3.id_class(this::id_throws);
      }

      ((Map)this.id_class[id_break[3]]).put(var1, var3);
      return this;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 270219163;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8776221014330812434L;
   }

   private boolean id_class(rrIA var1) {
      return Optional.ofNullable((rrIk_1)((Map)this.id_class[id_break[13]]).get(var1)).map(rrIk_1::id_class).orElse(id_byte[2]);
   }

   public CheckGroup id_class(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[5], var1);
   }

   public boolean id_class() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[6]);
   }

   public boolean id_break() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[3]);
   }

   public CheckGroup id_break(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[6], var1);
   }

   public CheckGroup id_throws(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[2], var1);
   }

   public boolean id_throws() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[id_break[14]]);
   }

   public boolean id_finally() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1]);
   }

   public boolean id_catch() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[5]);
   }

   public CheckGroup id_catch(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[id_break[4]], var1);
   }

   public boolean id_extends() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[8]);
   }

   public boolean id_case() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[4]);
   }

   public CheckGroup id_case(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1], var1);
   }

   public CheckGroup id_implements(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[4], var1);
   }

   public boolean id_implements() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[2]);
   }

   public CheckGroup id_protected(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[7], var1);
   }

   public Map<rrIA, rrIk_1> id_protected() {
      return (Map<rrIA, rrIk_1>)this.id_class[id_break[23]];
   }

   public CheckGroup id_private(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[8], var1);
   }

   public boolean id_private() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[7]);
   }

   private static void id_final() {
      id_byte = new boolean[]{false, true, false, true};
   }

   private static void id_volatile() {
      id_break = new short[]{0, 0, 1, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0};
   }

   private void id_native() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
