package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class rkg_3 implements Predicate<rdn_3> {
   public static final rkg_3 class_ = new rkg_3(Stream.empty());
   private final rkR_2[] break_;
   private rdn_3[] byte_;
   private IntList protected_;

   public JsonElement byte_() {
      if (this.break_.length == 1) {
         return this.break_[0].break_();
      } else {
         JsonArray var1 = new JsonArray();

         for (rkR_2 var5 : this.break_) {
            var1.add(var5.break_());
         }

         return var1;
      }
   }

   private rkg_3(Stream<? extends rkR_2> var1) {
      this.break_ = var1.toArray(rkR_2[]::new);
   }

   private static rkR_2 class_(JsonObject var0) {
      if (var0.has("item") && var0.has("tag")) {
         throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
      } else if (var0.has("item")) {
         rqO_2 var3 = new rqO_2(rpY_2.case_(var0, "item"));
         rdb_3 var4 = rVL.for_.break_(var3).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + var3 + "'"));
         return new rkY_2(new rdn_3(var4));
      } else if (var0.has("tag")) {
         rqO_2 var1 = new rqO_2(rpY_2.case_(var0, "tag"));
         rlb_3 var2 = rlZ_2.class_().break_().class_(var1);
         if (var2 == null) {
            throw new JsonSyntaxException("Unknown item tag '" + var1 + "'");
         } else {
            return new rko_3(var2);
         }
      } else {
         throw new JsonParseException("An ingredient entry needs either a tag or an item");
      }
   }

   public static rkg_3 class_(JsonElement var0) {
      if (var0 == null || var0.isJsonNull()) {
         throw new JsonSyntaxException("Item cannot be null");
      } else if (var0.isJsonObject()) {
         return break_(Stream.of(class_(var0.getAsJsonObject())));
      } else if (var0.isJsonArray()) {
         JsonArray var1 = var0.getAsJsonArray();
         if (var1.size() == 0) {
            throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
         } else {
            return break_(StreamSupport.<JsonElement>stream(var1.spliterator(), false).map(var0x -> class_(rpY_2.private_(var0x, "item"))));
         }
      } else {
         throw new JsonSyntaxException("Expected item to be object or array of objects");
      }
   }

   public boolean class_(rdn_3 var1) {
      if (var1 == null) {
         return false;
      } else {
         this.throws_();
         if (this.byte_.length == 0) {
            return var1.class_();
         } else {
            for (rdn_3 var5 : this.byte_) {
               if (var5.break_() == var1.break_()) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public rdn_3[] class_() {
      this.throws_();
      return this.byte_;
   }

   public void class_(ruu_3 var1) {
      this.throws_();
      var1.protected_(this.byte_.length);

      for (int var2 = 0; var2 < this.byte_.length; var2++) {
         var1.class_(this.byte_[var2]);
      }
   }

   public static rkg_3 class_(rpL_2... var0) {
      return class_(Arrays.stream(var0).map(rdn_3::new));
   }

   public static rkg_3 class_(rdn_3... var0) {
      return class_(Arrays.stream(var0));
   }

   public static rkg_3 class_(rlb_3<rdb_3> var0) {
      return break_(Stream.of(new rko_3(var0)));
   }

   public static rkg_3 class_(Stream<rdn_3> var0) {
      return break_(var0.filter(var0x -> !var0x.class_()).map(var0x -> new rkY_2(var0x)));
   }

   public IntList break_() {
      if (this.protected_ == null) {
         this.throws_();
         this.protected_ = new IntArrayList(this.byte_.length);

         for (rdn_3 var4 : this.byte_) {
            this.protected_.add(rWr_1.byte_(var4));
         }

         this.protected_.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.protected_;
   }

   public static rkg_3 break_(ruu_3 var0) {
      int var1 = var0.case_();
      return break_(Stream.<rkR_2>generate(() -> new rkY_2(var0.extends_())).limit((long)var1));
   }

   private static rkg_3 break_(Stream<? extends rkR_2> var0) {
      rkg_3 var1 = new rkg_3(var0);
      return var1.break_.length == 0 ? class_ : var1;
   }

   private void throws_() {
      if (this.byte_ == null) {
         this.byte_ = Arrays.stream(this.break_).flatMap(var0 -> var0.class_().stream()).distinct().toArray(rdn_3[]::new);
      }
   }

   public boolean protected_() {
      return this.break_.length == 0 && (this.byte_ == null || this.byte_.length == 0) && (this.protected_ == null || this.protected_.isEmpty());
   }
}
