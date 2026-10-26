package celestial;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.stream.IntStream;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class uF_2 implements uc_3 {
   private final ByteBuffer class_;
   final STBTTFontinfo break_;
   final float byte_;
   private final IntSet protected_ = new IntArraySet();
   final float throws_;
   final float case_;
   final float catch_;
   final float private_;

   public uF_2(ByteBuffer var1, STBTTFontinfo var2, float var3, float var4, float var5, float var6, String var7) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var4;
      var7.codePoints().forEach(this.protected_::add);
      this.throws_ = var5 * var4;
      this.case_ = var6 * var4;
      this.catch_ = STBTruetype.stbtt_ScaleForPixelHeight(var2, var3 * var4);
      MemoryStack var8 = MemoryStack.stackPush();

      try {
         IntBuffer var9 = var8.mallocInt(1);
         IntBuffer var10 = var8.mallocInt(1);
         IntBuffer var11 = var8.mallocInt(1);
         STBTruetype.stbtt_GetFontVMetrics(var2, var9, var10, var11);
         this.private_ = (float)var9.get(0) * this.catch_;
      } catch (Throwable var13) {
         if (var8 != null) {
            try {
               var8.close();
            } catch (Throwable var12) {
               var13.addSuppressed(var12);
            }
         }

         throw var13;
      }

      if (var8 != null) {
         var8.close();
      }
   }

   @Override
   public IntSet class_() {
      return IntStream.range(0, 65535).filter(var1 -> !this.protected_.contains(var1)).collect(IntOpenHashSet::new, IntCollection::add, IntCollection::addAll);
   }

   @Override
   public void close() {
      this.break_.free();
      MemoryUtil.memFree(this.class_);
   }

   public uL_2 break_(int var1) {
      if (this.protected_.contains(var1)) {
         return null;
      } else {
         MemoryStack var3 = MemoryStack.stackPush();

         uL_2 var13;
         label61: {
            Object var11;
            label62: {
               Object var2;
               try {
                  IntBuffer var4 = var3.mallocInt(1);
                  IntBuffer var5 = var3.mallocInt(1);
                  IntBuffer var6 = var3.mallocInt(1);
                  IntBuffer var7 = var3.mallocInt(1);
                  int var8 = STBTruetype.stbtt_FindGlyphIndex(this.break_, var1);
                  if (var8 != 0) {
                     STBTruetype.stbtt_GetGlyphBitmapBoxSubpixel(this.break_, var8, this.catch_, this.catch_, this.throws_, this.case_, var4, var5, var6, var7);
                     int var9 = var6.get(0) - var4.get(0);
                     int var10 = var7.get(0) - var5.get(0);
                     if (var9 != 0 && var10 != 0) {
                        IntBuffer var16 = var3.mallocInt(1);
                        IntBuffer var12 = var3.mallocInt(1);
                        STBTruetype.stbtt_GetGlyphHMetrics(this.break_, var8, var16, var12);
                        var13 = new uL_2(
                           this,
                           var4.get(0),
                           var6.get(0),
                           -var5.get(0),
                           -var7.get(0),
                           (float)var16.get(0) * this.catch_,
                           (float)var12.get(0) * this.catch_,
                           var8
                        );
                        break label61;
                     }

                     var11 = null;
                     break label62;
                  }

                  var2 = null;
               } catch (Throwable var15) {
                  if (var3 != null) {
                     try {
                        var3.close();
                     } catch (Throwable var14) {
                        var15.addSuppressed(var14);
                     }
                  }

                  throw var15;
               }

               if (var3 != null) {
                  var3.close();
               }

               return (uL_2)var2;
            }

            if (var3 != null) {
               var3.close();
            }

            return (uL_2)var11;
         }

         if (var3 != null) {
            var3.close();
         }

         return var13;
      }
   }
}
