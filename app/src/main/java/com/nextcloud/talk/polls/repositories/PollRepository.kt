package com.nextcloud.talk.polls.repositories

import com.nextcloud.talk.polls.model.Poll
import io.reactivex.Observable

interface PollRepository {

    fun getPoll(roomToken: String, pollId: String): Observable<Poll>?

    fun vote(roomToken: String, pollId: String, option: Int): Observable<Poll>?
}