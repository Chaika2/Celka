package celestial;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileStore;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileStoreAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzw_3 extends FileStore {
   private static short[] id_break;
   private static String[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_byte = new String[]{
         new String("zipfs"),
         new String("basic"),
         new String("zip"),
         new String("owner"),
         new String("posix"),
         new String("totalSpace"),
         new String("usableSpace"),
         new String("unallocatedSpace"),
         new String("does not support the given attribute")
      };
   }

   public rrzw_3(rrQs_1 var1) {
      this.id_class();
      rrzf_3 var6 = var1.id_private();
      this.id_class[id_break[0]] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public String name() {
      return ((rrzf_3)this.id_class[id_break[1]]).toString() + "/";
   }

   @Override
   public String type() {
      return id_byte[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6893891346880164565L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-56, -89, -10, 111, -116, -117, 11, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1567705164;
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[4]];
         Object[] var1 = this.id_class;
      }
   }

   @Override
   public boolean isReadOnly() {
      return ((rrzf_3)this.id_class[id_break[2]]).isReadOnly();
   }

   private static void id_break() {
      id_protected = new boolean[]{true, false, true, false, true};
   }

   @Override
   public long getUnallocatedSpace() throws IOException {
      return new rrzI_2(this).id_class();
   }

   @Override
   public boolean supportsFileAttributeView(Class<? extends FileAttributeView> var1) {
      return var1 != BasicFileAttributeView.class
            && var1 != rrzq_3.class
            && (var1 != FileOwnerAttributeView.class && var1 != PosixFileAttributeView.class || !((rrzf_3)this.id_class[id_break[3]]).id_break[id_break[4]])
         ? id_protected[1]
         : id_protected[0];
   }

   @Override
   public boolean supportsFileAttributeView(String var1) {
      return !id_byte[1].equals(var1)
            && !id_byte[2].equals(var1)
            && (!id_byte[3].equals(var1) && !id_byte[4].equals(var1) || !((rrzf_3)this.id_class[id_break[5]]).id_break[id_break[6]])
         ? id_protected[3]
         : id_protected[2];
   }

   @Override
   public <V extends FileStoreAttributeView> V getFileStoreAttributeView(Class<V> var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         return null;
      }
   }

   private static void id_protected() {
      id_break = new short[]{0, 0, 0, 0, 12, 0, 12};
   }

   @Override
   public long getTotalSpace() throws IOException {
      return new rrzI_2(this).id_byte();
   }

   @Override
   public long getUsableSpace() throws IOException {
      return new rrzI_2(this).id_break();
   }

   @Override
   public Object getAttribute(String var1) throws IOException {
      if (var1.equals(id_byte[5])) {
         return this.getTotalSpace();
      } else if (var1.equals(id_byte[6])) {
         return this.getUsableSpace();
      } else if (var1.equals(id_byte[7])) {
         return this.getUnallocatedSpace();
      } else {
         throw new UnsupportedOperationException(id_byte[8]);
      }
   }
}
