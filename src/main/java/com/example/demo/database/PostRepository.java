package com.example.demo.database;

import com.example.demo.dto.PostDto;

import java.util.HashMap;
import java.util.Map;

/**
 * Mock of DB
 */
public class PostRepository {
    private static final Map<Integer, PostDto> postMap = new HashMap<>();

    private PostRepository() {
    }

    /**
     * Returns mock of DB
     *
     * @return map with post objects
     */
    public static Map<Integer, PostDto> getPostMap() {
        if (postMap.isEmpty()) {
            fillMap(postMap);
        }

        return postMap;
    }

    private static void fillMap(Map<Integer, PostDto> map) {
        map.put(1, new PostDto(
                "1",
                "1",
                "\"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\"",
                "\"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"")
        );

        map.put(2, new PostDto(
                "1",
                "2",
                "\"qui est esse\"",
                "\"est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla\"")
        );

        map.put(3, new PostDto(
                "1",
                "3",
                "\"ea molestias quasi exercitationem repellat qui ipsa sit aut\"",
                "\"et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut ad\\nvoluptatem doloribus vel accusantium quis pariatur\\nmolestiae porro eius odio et labore et velit aut\"")
        );

        map.put(4, new PostDto(
                "1",
                "4",
                "\"eum et est occaecati\"",
                "\"ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit\"")
        );

        map.put(5, new PostDto(
                "1",
                "5",
                "\"nesciunt quas odio\"",
                "\"repudiandae veniam quaerat sunt sed\\nalias aut fugiat sit autem sed est\\nvoluptatem omnis possimus esse voluptatibus quis\\nest aut tenetur dolor neque\"")
        );

        map.put(6, new PostDto(
                "1",
                "6",
                "\"dolorem eum magni eos aperiam quia\"",
                "\"ut aspernatur corporis harum nihil quis provident sequi\\nmollitia nobis aliquid molestiae\\nperspiciatis et ea nemo ab reprehenderit accusantium quas\\nvoluptate dolores velit et doloremque molestiae\"")
        );

        map.put(7, new PostDto(
                "1",
                "7",
                "\"magnam facilis autem\"",
                "\"dolore placeat quibusdam ea quo vitae\\nmagni quis enim qui quis quo nemo aut saepe\\nquidem repellat excepturi ut quia\\nsunt ut sequi eos ea sed quas\"")
        );

        map.put(8, new PostDto(
                "1",
                "8",
                "\"dolorem dolore est ipsam\"",
                "\"dignissimos aperiam dolorem qui eum\\nfacilis quibusdam animi sint suscipit qui sint possimus cum\\nquaerat magni maiores excepturi\\nipsam ut commodi dolor voluptatum modi aut vitae\"")
        );

        map.put(9, new PostDto(
                "1",
                "9",
                "\"nesciunt iure omnis dolorem tempora et accusantium\"",
                "\"consectetur animi nesciunt iure dolore\\nenim quia ad\\nveniam autem ut quam aut nobis\\net est aut quod aut provident voluptas autem voluptas\"")
        );

        map.put(10, new PostDto(
                "1",
                "10",
                "\"optio molestias id quia eum\"",
                "\"quo et expedita modi cum officia vel magni\\ndoloribus qui repudiandae\\nvero nisi sit\\nquos veniam quod sed accusamus veritatis error\"")
        );
    }
}
