package restapi.com.midass.restapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductAPI {
    private final ProductService productService;
    static ArrayList<Product> ans = new ArrayList<Product>();

    public ProductAPI(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("all")
    public ArrayList<Product> findAl() {
        return ans;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Integer id) {
        // Optional<Product> product = productService.findById(id);

        return ResponseEntity.ok(productService.findById(id).get());
    }

    @PostMapping
    public ResponseEntity<Product> create(Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
    }

    @PostMapping("demo")
    public ResponseEntity<Product> createdemo(Product product) {
        Product pro = new Product();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(7);
        pro.setA(2);
        pro.setB(9);
        pro.setRange(list);
        pro.setTimestamp("2022 01 01 010 73297293");
        pro.setTimeelapsed("22 000o023072702392");
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(pro));
    }

    @PostMapping("all")
    public ArrayList<Product> createfottestcase(Product product) {

        int[] A = { 2, 3, 4, 5, 6, 2, 10 };
        int[] B = { 10, 11, 12, 13, 18, 20, 70 };
        for (int us = 0; us < A.length; us++) {
            ArrayList<Integer> range = new ArrayList<>();
            LocalDateTime DateandTime = LocalDateTime.now(); // Date
            long startTime = System.currentTimeMillis(); // calculate millis
            String StartDateAndTime = DateandTime + "  Stating MilliSecond  " + startTime;
            String EndDateandTime = DateandTime + "  :";

            for (int i = A[us] + 1; i < B[us]; i++) {
                if (isPrime(i)) {
                    range.add(i);
                }
            }
            EndDateandTime += "  Ending Millisecond =  " + startTime + " And Difference of Millis = "
                    + (System.currentTimeMillis() - startTime);
            ans.add(new Product(us, A[us], B[us], range, StartDateAndTime, EndDateandTime));

        }

        return ans;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product product) {
        return ResponseEntity.accepted().body(productService.save(product));
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity delete(@PathVariable Long id) {
    // productService.deleteById(id);

    // return ResponseEntity.accepted().build();
    // }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}